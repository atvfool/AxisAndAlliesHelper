package com.atvfool.axisandallies;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ahayden on 4/28/2017.
 */

public class CAxisAndAllies implements Serializable {

    protected ArrayList<CGamePiece> m_alPieces;
    protected int m_intAvailableIPCs;


    public CAxisAndAllies()
    {
        super();
        //MakePieces();
    }

    public ArrayList<CGamePiece> MakePieces()
    {
        ArrayList<CGamePiece> alPieces = new ArrayList<CGamePiece>();

        return alPieces;
    }

    public CGamePiece getPiece(int name)
    {
        int i;
        for(i=0; i< m_alPieces.size(); i++)
        {
            if(m_alPieces.get(i).name() == name)
            {
                break;
            }
        }
        return m_alPieces.get(i);
    }

    protected int getPieceIndex(int name)
    {
        int i=-1;
        for(int j=0; j< m_alPieces.size(); j++)
        {
            if(m_alPieces.get(j).name() == name)
            {
                i = j;
                break;
            }
        }
        return i;
    }



}
