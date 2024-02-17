package k;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;

public class MyController extends GenericForwardComposer<Component> {

    private Button myButton;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        myButton.addEventListener("onMouseOver", evt -> onMouseOver());
        myButton.addEventListener("onMouseOut", evt -> onMouseOut());
    }

    private void onMouseOver() {
        // Execute code when mouse is over the button
        myButton.setStyle("background-color: yellow;");
    }

    private void onMouseOut() {
        // Execute code when mouse leaves the button
        myButton.setStyle("background-color: blue;");
    }
}
