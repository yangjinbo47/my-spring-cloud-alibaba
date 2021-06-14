package com.anqing.myspringcloudalibaba.admin.service;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.domain.events.InstanceStatusChangedEvent;
import de.codecentric.boot.admin.server.notify.AbstractEventNotifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/12
 * @Author: BOBO
 * @Description:
 */
@Service
@Slf4j
public class CustomNotifier extends AbstractEventNotifier{

    /**
     * 消息模板
     */
    private static final String template = "服务名:%s(%s) \n状态:%s(%s) \n服务ip:%s";

    public CustomNotifier(InstanceRepository repository) {
        super(repository);
    }

    @Override
    protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
        return Mono.fromRunnable(() -> {
            if (event instanceof InstanceStatusChangedEvent) {
                log.info("Instance {} ({}) is {}", instance.getRegistration().getName(), event.getInstance(),
                        ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus());

                String status = ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus();
                String messageText = null;
                switch (status) {
                    // 健康检查没通过
                    case "DOWN":
                        log.info("发送 健康检查没通过 的通知！");
                        messageText = String.format(template, instance.getRegistration().getName(),event.getInstance(), ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus(),"健康检查没通过",instance.getRegistration().getServiceUrl());
                        System.out.println("sendMsg==="+messageText);
                        break;
                    // 服务离线
                    case "OFFLINE":
                        log.info("发送 服务离线 的通知！");
                        messageText = String.format(template, instance.getRegistration().getName(),event.getInstance(), ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus(),"服务离线",instance.getRegistration().getServiceUrl());
                        System.out.println("sendMsg==="+messageText);
                        break;
                    //服务上线
                    case "UP":
                        log.info("发送 服务上线 的通知！");
                        messageText = String.format(template, instance.getRegistration().getName(),event.getInstance(), ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus(),"服务上线",instance.getRegistration().getServiceUrl());
                        System.out.println("sendMsg==="+messageText);
                        break;
                    // 服务未知异常
                    case "UNKNOWN":
                        log.info("发送 服务未知异常 的通知！");
                        messageText = String.format(template, instance.getRegistration().getName(),event.getInstance(), ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus(),"服务未知异常",instance.getRegistration().getServiceUrl());
                        System.out.println("sendMsg==="+messageText);
                        break;
                    default:
                        break;
                }
            } else {
                log.info("Instance {} ({}) {}", instance.getRegistration().getName(), event.getInstance(),
                        event.getType());
            }
        });
    }
}
