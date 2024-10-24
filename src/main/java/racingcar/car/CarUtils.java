package racingcar.car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.racer.RacerUtils;

public class CarUtils implements RacerUtils {
    @Override
    public boolean isMovable(int randomNum) {
        if (0 <= randomNum && randomNum <= 4) {
            return false;
        } else if (5 <= randomNum && randomNum <= 9) {
            return true;
        } else {
            throw new RuntimeException("랜덤값이 0 ~ 9 범위를 벗어났습니다.");
        }
    }

    @Override
    public int pickNumber(int minNum, int maxNum) {
        return Randoms.pickNumberInRange(minNum, maxNum);
    }
}
