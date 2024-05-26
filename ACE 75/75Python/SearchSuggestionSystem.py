class Solution(object):
    def suggestedProducts(self, products, searchWord):
        products.sort()
        list = []
        prefix = ""
        for i in range(len(searchWord)):
            sublist = []
            count = 0
            prefix += searchWord[i]
            for prod in products:
                if len(prod) >= len(prefix) and prod[0:i+1] == prefix and count < 3:
                    sublist.append(prod)
                    count += 1
            list.append(sublist)
        return list