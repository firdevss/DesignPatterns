public class Main {
    public static void main(String[] args) {

        // Create an editor and history
        Editor editor = new Editor();
        History history = new History();

        // Set initial content and save state
        editor.setContent("Initial content");
        history.push(editor.createState());

        // Modify content
        editor.setContent("Modified content");

        // Save state
        history.push(editor.createState());

        // Restore to previous state
        editor.restore(history.pop());

        // Print current content
        System.out.println("Memento Design Pattern Implementation; content: " + editor.getContent());

    }
}