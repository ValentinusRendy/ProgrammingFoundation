from day2_4 import get_customer_input, approval, output_approval, continue_input, read_data_customer
import sys


if len(sys.argv) < 2:
    print(f'Usage: python {sys.argv[0]} <filename>')
else:
    filename = sys.argv[1]
    data = read_data_customer(filename)


    if data == None or len(data) == 0:
        exit
        
    else:
        for row in data:
            nama_customer = row['name']
            umur = int(row['age'])
            penghasilan = float(row['salary'])

            Status = approval(umur, penghasilan) 
            output_approval(nama_customer, Status)

    # if continue_input():
    #     print("Program Selesai")
    #     break

