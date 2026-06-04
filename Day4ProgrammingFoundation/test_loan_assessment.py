import unittest
from assessment_lib import approval

class TestLoanAssessment(unittest.TestCase):

    def test_customer_eligible1(self):
        result = approval(27, 9_000_000)
        self.assertEqual(result, "Eligibel")
    
    def test_customer_eligible2(self):
        result = approval(25, 7_000_000)
        self.assertEqual(result, "Manual Review")

    def test_customer_eligible3(self):
        result = approval(29, 2_000_000)
        self.assertEqual(result, "Tidak Eligibel")

    

if __name__ == "__main__":
    unittest.main()