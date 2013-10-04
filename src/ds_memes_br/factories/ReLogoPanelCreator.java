package ds_memes_br.factories;

import javax.swing.JPanel;
import repast.simphony.relogo.factories.AbstractReLogoPanelCreator;
import ds_memes_br.relogo.UserGlobalsAndPanelFactory;

public class ReLogoPanelCreator extends AbstractReLogoPanelCreator {

    public void addComponents(JPanel parent) {
        UserGlobalsAndPanelFactory ugpf = new UserGlobalsAndPanelFactory();
        ugpf.initialize(parent);
        ugpf.addGlobalsAndPanelComponents();
    }

}
