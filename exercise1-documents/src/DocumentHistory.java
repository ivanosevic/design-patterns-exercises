import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    private final List<DocumentState> states;

    public DocumentHistory() {
        this.states = new ArrayList<>();
    }

    public void storeState(DocumentState currentState) {
        this.states.add(currentState);
    }

    public DocumentState pop() {
        var lastElementIndex = states.size() - 1;
        if (lastElementIndex < 0) {
            return null;
        }
        var lastElement = states.get(lastElementIndex);
        states.remove(lastElement);
        return lastElement;
    }
}
