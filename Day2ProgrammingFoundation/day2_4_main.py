from day2_4 import get_customer_input, approval, output_approval, continue_input

while True:
    try: 
        nama_customer, umur, penghasilan = get_customer_input()
        Status = approval(umur, penghasilan) 
        output_approval(nama_customer, Status)
        
        if continue_input():
            print("Program Selesai")
            break

    except ValueError:
        print("Masukkan input angka yang valid")
    except Exception as e:
        print("Masukkan input yang valid: ", e)




