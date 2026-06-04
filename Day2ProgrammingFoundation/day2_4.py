def read_data_customer(filename):
    data = []

    with open(filename, 'r') as file:
        next(file)
        try: 
            for line in file:
                values = line.strip().split(',')
                if type(values[1]) == int and type(values[2]) == int:
                    row = dict(name=values[0], age=values[1], salary=values[2])
                    data.append(row)
                else:
                    raise Exception()
            return data
            
        except Exception:
            print("File input not valid", filename)
    

def get_customer_input():
    nama_customer = input("Masukkan nama anda: ")    
    if any(char.isdigit() for char in nama_customer):
        raise ValueError("Nama tidak valid")
    umur = int(input("Masukkan umur anda: "))
    penghasilan = int(input("Masukkan penghasilan anda: "))

    return nama_customer, umur, penghasilan
    
    

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

def output_approval(namaCustomer, Status):
    print("Name: ", namaCustomer,"--> Decision: ", Status)

def continue_input():
    stop = ["t", "no", "T"]
    answer = input("Apakah mau lanjut (y/t)?")
    
    if answer in stop:
        return True
    return False
    



