package com.atvfool.axisandallies;

import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by ahayden on 4/28/2017.
 */

public class C1914AxisAndAllies extends CAxisAndAllies {

    public C1914AxisAndAllies()
    {

        m_alPieces = MakePieces();

    }

    @Override
    public ArrayList<CGamePiece> MakePieces()
    {
        ArrayList<CGamePiece> alPieces = new ArrayList<CGamePiece>();

        CGamePiece gpInfantry = new CGamePiece(R.string.infantry_name, 3,0, R.mipmap.infantry);
        CGamePiece gpArtillery = new CGamePiece(R.string.artillery_name,4,0, R.mipmap.artillery);
        CGamePiece gpTank = new CGamePiece(R.string.tank_name, 6,0, R.mipmap.tank);
        CGamePiece gpFighter = new CGamePiece(R.string.fighter_name, 6,0, R.mipmap.fighter);
        CGamePiece gpBattleship = new CGamePiece(R.string.battleship_name, 12,0, R.mipmap.battleship);
        CGamePiece gpCruiser = new CGamePiece(R.string.cruiser_name, 9,0, R.mipmap.cruiser);
        CGamePiece gpSub = new CGamePiece(R.string.submarine_name, 6,0, R.mipmap.sub);
        CGamePiece gpTransport = new CGamePiece(R.string.transport_name, 6,0, R.mipmap.transport);

        alPieces.add(gpInfantry);
        alPieces.add(gpArtillery);
        alPieces.add(gpTank);
        alPieces.add(gpFighter);
        alPieces.add(gpBattleship);
        alPieces.add(gpCruiser);
        alPieces.add(gpSub);
        alPieces.add(gpTransport);

        return alPieces;
    }

    public int total()
    {
        int intTotal=0;
        for (CGamePiece gp: m_alPieces) {
            intTotal += gp.total();
        }
        return intTotal;
    }

    public void AddOneToQuantityOfPiece(int piece)
    {

        m_alPieces.get(getPieceIndex(piece)).add();
    }

    public void SubtractOneToQuantityOfPiece(int piece)
    {
        m_alPieces.get(getPieceIndex(piece)).subtract();
    }

    public void clearQuantity()
    {
        for (CGamePiece gp: m_alPieces)
        {
            gp.quantity(0);
        }
    }

    public String getPieceQuantityString(int piece)
    {
        return String.valueOf(getPiece(piece).quantity());
    }



}
