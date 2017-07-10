import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.util.ArrayList;

public class Bag {

    private ArrayList<Item> items = new ArrayList<>();

    public class Item {

        String description;
        int quantity;
        double unitPrice;

        private Item(String _description, int _quantity, double _unitPrice)
        {
            this.description = _description;
            this.quantity = _quantity;
            this.unitPrice = _unitPrice;
        }
        double price()
        {
            return quantity * unitPrice;
        }

        @Override
        public String toString()
        {
            return description + ", " + quantity + ", " + unitPrice+". ";
        }

        public void removeItem ()
        {
            items.remove(this);
        }

        public Item showItemInfo()
        {
            return this;
        }

        public boolean isBelongingTo (Bag inv)
        {
            return Bag.this == inv;
        }
    }
    public Item addItem (String _description, int _quality, double _unitPrice)
    {
        Item item = new Item(_description,_quality,_unitPrice);
        items.add(item);
        return item;
    }

    public String getList()
    {
        return items.toString();
    }

    public boolean isAlreadyIn (Item item)
    {
        return items.contains(item);
    }
}
