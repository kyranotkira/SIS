package StudentInformationSystem;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class jCheckRender extends DefaultTableCellRenderer  {
    public jCheckRender() {
    }
     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
          JCheckBox checkBox = new JCheckBox();
          checkBox.setSelected((Boolean) value);
          return checkBox;
        }
     }