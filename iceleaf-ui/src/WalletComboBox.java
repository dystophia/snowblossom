package snowblossom.iceleaf;

import duckutil.PeriodicThread;
import java.util.Collection;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

public class WalletComboBox extends JComboBox<String>
{
  private IceLeaf ice_leaf;
  protected TreeSet<String> current_select_box_items=new TreeSet<>();

  public WalletComboBox(IceLeaf ice_leaf)
  {
    this.ice_leaf = ice_leaf;

    UpdateThread ut = new UpdateThread();

    ut.start();
    ice_leaf.getWalletPanel().addWakeThread(ut);

  }
  public class UpdateThread extends PeriodicThread
  {
    public UpdateThread()
    { 
      super(60000);
    }

    public void runPass() throws Exception
    { 
      try
      { 
        updateBox(ice_leaf.getWalletPanel().getNames());
      }
      catch(Throwable e)
      { 
        e.printStackTrace();
      }

    }

  }

  public void updateBox(Collection<String> names)
    throws Exception
  {
    synchronized(current_select_box_items)
    { 
      TreeSet<String> new_set = new TreeSet<>();
      new_set.addAll(names);

      if (current_select_box_items.equals(new_set))
      { 
        return;
      }

      SwingUtilities.invokeAndWait(new Runnable() {
        public void run()
        { 

          removeAllItems();
          addItem("<none>");
          for(String s : new_set)
          {
            addItem(s);
          }
          setSelectedIndex(0);

        }
      });

      current_select_box_items.clear();
      current_select_box_items.addAll(new_set);
    }

  }




}
