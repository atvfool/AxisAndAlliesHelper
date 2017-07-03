package com.atvfool.axisandallies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
/**
 * Created by arhayden on 4/30/2017.
 */

public class ana1914 extends AppCompatActivity {


    // Game
    private C1914AxisAndAllies m_clsAnA;

    private ImageButton m_btnClear;

    // IPCs
    private EditText m_txtAvailableIPCs;
    private int m_intTotalIPCs = 30;
    private ImageButton m_btnSetIPCs;

    // Infantry
    private ImageButton m_btnAddInfantry;
    private ImageButton m_btnMinusInfantry;
    private EditText m_txtQuantityInfantry;

    // Artillery
    private ImageButton m_btnAddArtillery;
    private ImageButton m_btnMinusArtillery;
    private EditText m_txtQuantityArtillery;

    // Tank
    private ImageButton m_btnAddTank;
    private ImageButton m_btnMinusTank;
    private EditText m_txtQuantityTank;

    // Fighter
    private ImageButton m_btnAddFighter;
    private ImageButton m_btnMinusFighter;
    private EditText m_txtQuantityFighter;

    // Battleship
    private ImageButton m_btnAddBattleship;
    private ImageButton m_btnMinusBattleship;
    private EditText m_txtQuantityBattleship;

    // Cruiser
    private ImageButton m_btnAddCruiser;
    private ImageButton m_btnMinusCruiser;
    private EditText m_txtQuantityCruiser;

    // Submarine
    private ImageButton m_btnAddSubmarine;
    private ImageButton m_btnMinusSubmarine;
    private EditText m_txtQuantitySubmarine;

    // Transport
    private ImageButton m_btnAddTransport;
    private ImageButton m_btnMinusTransport;
    private EditText m_txtQuantityTransport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana1914);

        m_clsAnA = new C1914AxisAndAllies();

        m_btnClear = (ImageButton) findViewById(R.id.btnClear);

        m_txtAvailableIPCs = (EditText) findViewById(R.id.txtAvailableIPCs);
        m_txtAvailableIPCs.setText(String.valueOf(m_intTotalIPCs));

        m_btnSetIPCs = (ImageButton) findViewById(R.id.btnSetIPCs);

        m_txtAvailableIPCs.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // Infantry
        m_txtQuantityInfantry = (EditText) findViewById(R.id.txtQuantityInfantry);
        m_btnAddInfantry = (ImageButton) findViewById(R.id.btnPlusInfantry);
        m_btnMinusInfantry = (ImageButton) findViewById(R.id.btnMinusInfantry);
        // Artillery
        m_txtQuantityArtillery = (EditText) findViewById(R.id.txtQuantityArtillery);
        m_btnAddArtillery = (ImageButton) findViewById(R.id.btnPlusArtillery);
        m_btnMinusArtillery = (ImageButton) findViewById(R.id.btnMinusArtillery);
        // Tank
        m_txtQuantityTank = (EditText) findViewById(R.id.txtQuantityTank);
        m_btnAddTank = (ImageButton) findViewById(R.id.btnPlusTank);
        m_btnMinusTank = (ImageButton) findViewById(R.id.btnMinusTank);
        // Fighter
        m_txtQuantityFighter = (EditText) findViewById(R.id.txtQuantityFighter);
        m_btnAddFighter = (ImageButton) findViewById(R.id.btnPlusFighter);
        m_btnMinusFighter = (ImageButton) findViewById(R.id.btnMinusFighter);

        // Battleship
        m_txtQuantityBattleship = (EditText) findViewById(R.id.txtQuantityBattleship);
        m_btnAddBattleship = (ImageButton) findViewById(R.id.btnPlusBattleship);
        m_btnMinusBattleship = (ImageButton) findViewById(R.id.btnMinusBattleship);

        // Cruiser
        m_txtQuantityCruiser = (EditText) findViewById(R.id.txtQuantityCruiser);
        m_btnAddCruiser = (ImageButton) findViewById(R.id.btnPlusCruiser);
        m_btnMinusCruiser = (ImageButton) findViewById(R.id.btnMinusCruiser);

        // Submarine
        m_txtQuantitySubmarine = (EditText) findViewById(R.id.txtQuantitySubmarine);
        m_btnAddSubmarine = (ImageButton) findViewById(R.id.btnPlusSubmarine);
        m_btnMinusSubmarine = (ImageButton) findViewById(R.id.btnMinusSubmarine);

        // Transport
        m_txtQuantityTransport = (EditText) findViewById(R.id.txtQuantityTransport);
        m_btnAddTransport = (ImageButton) findViewById(R.id.btnPlusTransport);
        m_btnMinusTransport = (ImageButton) findViewById(R.id.btnMinusTransport);

    }


    public void btnPlusInfantry_OnClick(View view)
    {
        m_clsAnA.AddOneToQuantityOfPiece(R.string.infantry_name);
        RecalculateIPCs();
    }

    public void btnMinusInfantry_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.infantry_name);
        RecalculateIPCs();
    }

    public void btnPlusArtillery_OnClick(View view)
    {
        m_clsAnA.AddOneToQuantityOfPiece(R.string.artillery_name);
        RecalculateIPCs();

    }

    public void btnMinusArtillery_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.artillery_name);
        RecalculateIPCs();
    }

    public void btnPlusTank_OnClick(View view)
    {
        m_clsAnA.AddOneToQuantityOfPiece(R.string.tank_name);
        RecalculateIPCs();

    }

    public void btnMinusTank_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.tank_name);
        RecalculateIPCs();
    }

    public void btnPlusFighter_OnClick(View view)
    {
        m_clsAnA.AddOneToQuantityOfPiece(R.string.fighter_name);
        RecalculateIPCs();

    }

    public void btnMinusFighter_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.fighter_name);
        RecalculateIPCs();
    }


    public void btnPlusBattleship_OnClick(View view)
    {
        m_clsAnA.AddOneToQuantityOfPiece(R.string.battleship_name);
        RecalculateIPCs();

    }

    public void btnMinusBattleship_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.battleship_name);
        RecalculateIPCs();
    }


    public void btnPlusCruiser_OnClick(View view)
    {

        m_clsAnA.AddOneToQuantityOfPiece(R.string.cruiser_name);
        RecalculateIPCs();

    }

    public void btnMinusCruiser_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.cruiser_name);
        RecalculateIPCs();
    }


    public void btnPlusSubmarine_OnClick(View view)
    {

        m_clsAnA.AddOneToQuantityOfPiece(R.string.submarine_name);
        RecalculateIPCs();

    }

    public void btnMinusSubmarine_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.submarine_name);
        RecalculateIPCs();
    }


    public void btnPlusTransport_OnClick(View view)
    {

        m_clsAnA.AddOneToQuantityOfPiece(R.string.transport_name);
        RecalculateIPCs();

    }

    public void btnMinusTransport_OnClick(View view)
    {
        m_clsAnA.SubtractOneToQuantityOfPiece(R.string.transport_name);
        RecalculateIPCs();
    }

    public void btnSetIPCs_OnClick(View view)
    {
        if(m_txtAvailableIPCs.getText().length() >0)
        {
            m_intTotalIPCs = Integer.parseInt(m_txtAvailableIPCs.getText().toString());
            RecalculateIPCs();
        }
    }

    public void btnClear_OnClick(View view)
    {

        m_clsAnA.clearQuantity();
        RecalculateIPCs();
    }

    public void updateTextView()
    {
        m_txtQuantityInfantry.setText(m_clsAnA.getPieceQuantityString(R.string.infantry_name));
        m_txtQuantityArtillery.setText(m_clsAnA.getPieceQuantityString(R.string.artillery_name));
        m_txtQuantityTank.setText(m_clsAnA.getPieceQuantityString(R.string.tank_name));
        m_txtQuantityFighter.setText(m_clsAnA.getPieceQuantityString(R.string.fighter_name));
        m_txtQuantityBattleship.setText(m_clsAnA.getPieceQuantityString(R.string.battleship_name));
        m_txtQuantityCruiser.setText(m_clsAnA.getPieceQuantityString(R.string.cruiser_name));
        m_txtQuantitySubmarine.setText(m_clsAnA.getPieceQuantityString(R.string.submarine_name));
        m_txtQuantityTransport.setText(m_clsAnA.getPieceQuantityString(R.string.transport_name));
    }





    private void RecalculateIPCs()
    {
        int intRemainingIPCs;

        intRemainingIPCs = m_intTotalIPCs - m_clsAnA.total();

        m_txtAvailableIPCs.setText(String.valueOf(intRemainingIPCs));
        updateTextView();
    }



}
