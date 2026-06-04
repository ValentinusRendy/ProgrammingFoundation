from read_file_function import approval, output_approval, read_data_customer, upadate_summary, print_summary
import sys


if len(sys.argv) < 2:
    print(f'Usage: python {sys.argv[0]} <filename>')
else:
    filename = sys.argv[1]
    data = read_data_customer(filename)


    if data == None or len(data) == 0:
        exit
        
    else:
        results = approval(data)
        summary = {
            "Eligible" : 0,
            "Not Eligible" : 0,
            "Manual Review" : 0
        }

        for customer in results:
            nama_customer = customer[0]
            Status = customer[1]
            
            output_approval(nama_customer, Status)
            upadate_summary(summary, Status)

        print_summary(summary)



