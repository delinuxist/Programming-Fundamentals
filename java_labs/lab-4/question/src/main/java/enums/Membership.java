package enums;

import java.time.LocalTime;

public enum Membership {
    Bronze(5,false){
        public boolean checkTimeLimit() {
            LocalTime timeLimit = LocalTime.of(10,0,0);
            LocalTime currentTime = LocalTime.now();
            return currentTime.isAfter(timeLimit);
        }

        @Override
        public boolean canTrade(int numberOfTrades) {
            if(!checkTimeLimit()){
                return false;
            }
            return super.canTrade(numberOfTrades);
        }
    },
    Silver(10,true){

    },
    Gold(20,false){
        @Override
        public boolean canTrade(int numberOfTrades) {
            return super.canTrade(numberOfTrades);
        }
    };

    private final int maxTrade;
    private final boolean hasTradingLimit;

    private final int tradeLimit = 10000;

    Membership(int maxTrade,boolean hasTradingLimit) {
        this.maxTrade = maxTrade;
        this.hasTradingLimit = hasTradingLimit;
    }

    public int getMaxTrade() {
        return maxTrade;
    }

    public boolean getHasTradingLimit() {
        return hasTradingLimit;
    }



   public boolean canTrade(int numberOfTrades) {
        return numberOfTrades < maxTrade;
    }
}
