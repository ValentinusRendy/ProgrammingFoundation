MIN_AGE = 21
MIN_SALARY = 3000000

namaCustomer = input("Masukkan nama anda: ")
umur = int(input("Masukkan umur anda: "))
penghasilan = int(input("Masukkan penghasilan anda: "))

if umur < MIN_AGE:
    print(namaCustomer, "Tidak eligible secara usia")
elif penghasilan < MIN_SALARY:
    print(namaCustomer, "Tidak eligible secara penghasilan")
elif umur >= MIN_AGE and penghasilan >= MIN_SALARY:
    print(namaCustomer, "Konsumen Eligible")
else:
    print("Konsumen tidak eligible secara umur dan penghasilan")




