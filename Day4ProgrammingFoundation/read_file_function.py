from ModelPython.Customer import Customer_model, Risk_Assesor


def read_data_customer(filename):
    datas = []

    with open(filename, 'r') as file:
        next(file)
        try: 
            for line in file:
                values = line.strip().split(',')
                Customer = Customer_model(name=values[0], age=int(values[1]), salary=int(values[2]))
                datas.append(Customer)
            return datas
            
        except Exception:
            print("File input not valid", filename)

def approval(datas):
    results = []
    for customer in datas:
        status = Risk_Assesor.assess(customer)
        cust_result = [customer.name, status]
        results.append(cust_result)
    return results

def output_approval(namaCustomer, Status):
    print("Name: ", namaCustomer,"--> Decision: ", Status)

def upadate_summary(summary, decision):
    summary[decision] += 1

def print_summary(summary):
    print("\nSummary:")
    print(summary)

   




