package five.lab.service;

import java.time.Year;

import five.lab.model.Positions;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnnualBonusServiceImpl implements AnnualBonusService {

    @Override
    public double calculate(Positions position, double salary, double bonus, int workDays){
        Year year = Year.parse("2025");
        int daysYear = year.length();
        log.info("Дней в году: {}", daysYear);
        return salary * bonus * daysYear * position.getPositionCoefficient()/ workDays;
    }
}
