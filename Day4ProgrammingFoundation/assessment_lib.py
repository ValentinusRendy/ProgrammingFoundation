def approval(umur, penghasilan):
    MIN_AGE = 21
    MIN_SALARY_BOT = 3000000
    MIN_SALARY_TOP = 8000000

    Status = "Tidak Eligble"
    if umur >= MIN_AGE:
        if MIN_SALARY_BOT <= penghasilan < MIN_SALARY_TOP:
            Status = "Manual Review"

        elif penghasilan >= MIN_SALARY_BOT:
            Status = "Eligibel"
        else:  
            Status = "Tidak Eligibel" 
    return Status