package five.lab.service;

import five.lab.model.Positions;

public class AnnualBonusServiceImpl implements AnnualBonusService {

    @Override
    public double calculate(Positions position, double salary, double bonus, int workDays){
        return salary * bonus * 365 * position.getPositionCoefficient()/ workDays;
    }
}
