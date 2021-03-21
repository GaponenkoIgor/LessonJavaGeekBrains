package com.company.homework8.train.core;

import com.company.homework8.train.core.domain.MatrixCoordinate;
import com.company.homework8.train.enums.DotType;

public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

}
