package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private List<String> userInputList = new ArrayList<>();
    private List <Boolean> result = new ArrayList<>();

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(List<String> bridge,String userInput, int inputIdx) {
        userInputList.add(userInput);
        //for test
        System.out.println(bridge);
        if(bridge.get(inputIdx).equals(userInput)){
            result.add(true);
            return true;
        }
        result.add(false);
        return false;
    }

    public List<String> userInputList(){
        return userInputList;
    }

    public List<Boolean> getResult(){
        return result;
    }
    public int getUserInputListLength(){
        return userInputList.size();
    }
    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
