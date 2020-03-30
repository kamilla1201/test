import json
import requests

url = "https://instantanswers.herokuapp.com/search"
gen_link = lambda query, all_res : "{}?q={}&all={}".format(url, query, all_res)

def get_results(query, get_all_results=False):
    link = gen_link(query, get_all_results)
    r = requests.get(url=link)
    print(json.dumps(r.json(), indent=2))

get_results("pdx airport", True)
