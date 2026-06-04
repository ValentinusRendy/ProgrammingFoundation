while True:

    MIN_AGE = 21
    MIN_SALARY_BOT = 3000000
    MIN_SALARY_TOP = 8000000


    stop = ["t", "no", "T"]

    try: 
        nama_customer = input("Masukkan nama anda: ")
        
        if any(char.isdigit() for char in nama_customer):
            raise ValueError("Nama tidak valid")

        umur = int(input("Masukkan umur anda: "))
        penghasilan = int(input("Masukkan penghasilan anda: "))

        Status = "Tidak Eligble"
        if umur >= MIN_AGE:
            if MIN_SALARY_BOT <= penghasilan < MIN_SALARY_TOP:
                Status = "Manual Review"

            elif penghasilan >= MIN_SALARY_BOT:
                Status = "Eligibel"

            else:  
                Status = "Tidak Eligibel" 

        print(nama_customer, Status)

        answer = input("Apakah mau lanjut (y/t)?")
        
        if answer in stop:
            print("Program berhenti")
            break

    except ValueError:
        print("Masukkan input angka yang valid")
    except Exception as e:
        print("Masukkan input yang valid: ", e)




