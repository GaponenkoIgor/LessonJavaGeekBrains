package com.company.levle1.homework5.train.core;

import com.company.levle1.homework5.train.core.domain.MatrixCoordinate;
import com.company.levle1.homework5.train.enums.DotType;

public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

}
