package ru.javabegin.micro.planner.plannertodo.mq;

//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;
import ru.javabegin.micro.planner.plannertodo.service.TestDataService;

import java.util.function.Consumer;
import java.util.function.Supplier;

//@EnableBinding(TodoBinding.class)
@Component
public class MessageConsumer {

    private TestDataService testDataService;


    private MessageConsumer(TestDataService testDataService){
        this.testDataService = testDataService;
    }

    @Bean
    public Consumer<Long> todoInputChannel() {
        return userId -> {
            try {
                initTestData(userId);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    // метод вызывается автометически как только появляется сообщение в канале
//    @StreamListener(target = TodoBinding.INPUT_CHANNEL)
    public void initTestData(Long userId) throws Exception {
        throw new Exception("test dlq");
        //testDataService.initTestData(userId);
    }
}
