package good_enough_inc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swp99
 */
public class Item {
    private String party;
    private String[] names;
    public Item()
    {
        this.party=null;
        this.names[0]=null;
    }
    public Item(String party, String[] names)
    {
        this.party=party;
        this.names=new String[names.length];
        for(int i=0; i<names.length; i++)
        {
            this.names[i]=names[i];
        }
    }
}