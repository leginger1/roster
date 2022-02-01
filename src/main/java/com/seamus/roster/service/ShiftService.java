package com.seamus.roster.service;

import com.seamus.roster.data.Shift;

public interface ShiftService {

    Shift createShift(Shift shift);

    Shift getShift(Long id);

    Shift updateShift(Shift shift);

    void deleteShift(Long id);
}
