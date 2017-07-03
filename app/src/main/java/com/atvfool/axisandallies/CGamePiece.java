package com.atvfool.axisandallies;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by ahayden on 4/28/2017.
 */

public class CGamePiece {

    public int name() {
        return m_intName;
    }

    public void name(int intName) {
        this.m_intName = intName;
    }

    public int cost() {
        return m_intCost;
    }

    public void cost(int intCost) {
        this.m_intCost = intCost;
    }

    public int quantity() {
        return m_intQuantity;
    }

    public void quantity(int intQuantity) {
        this.m_intQuantity = intQuantity;
    }

    public int imageID() {
        return m_intImageID;
    }

    public void imageID(int intImageID) {
        this.m_intImageID = intImageID;
    }

    protected int m_intName;
    protected int m_intCost;
    protected int m_intQuantity;
    protected int m_intImageID;

    public CGamePiece()
    {
        super();
    }

    public CGamePiece(int intName, int intCost, int intQuantity, int intImageID)
    {
        super();
        m_intName = intName;
        m_intCost = intCost;
        m_intQuantity = intQuantity;
        m_intImageID = intImageID;
    }

    public int total()
    {
        int intTotalCost = m_intCost * m_intQuantity;

        return intTotalCost;
    }

    public void add(int i)
    {
        m_intQuantity += i;
    }

    public void add()
    {
        add(1);
    }

    public void subtract(int i)
    {
        if ((m_intQuantity-i) <0)
        {
            m_intQuantity =0;
        }
        else
        {
            m_intQuantity -=i;
        }
    }

    public void subtract()
    {
        subtract(1);
    }


}
