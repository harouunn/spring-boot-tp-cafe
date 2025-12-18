package tn.esprit.spring.tpcafe_harounbensalem.schedular;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tn.esprit.spring.tpcafe_harounbensalem.services.Client.IClientService;
import tn.esprit.spring.tpcafe_harounbensalem.services.Promotion.IPromotionService;


@Component
@AllArgsConstructor
@Slf4j
public class ScheduledMethods {
    IClientService clientService;
    IPromotionService promotionService;

    @Scheduled(fixedRate = 2000)
    public void method1(){
        log.info("vous pouvez prendre pause :");
    }
    /*@Scheduled(fixedDelay = 2000)
    public void method2(){
        log.info("vous pouvez revenir :");
    }**/
    @Scheduled(cron = "0 0 0 * * *")
    public void anniversaire(){

    }
    @Scheduled(cron="0 0 0 1 * *")
    public void promotionMois(){
        promotionService.findPromotionsDuMois();

    }

}
