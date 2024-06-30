from pydantic import BaseModel

class Data(BaseModel):
    id:int 
    regione:str
    anno:int 
    arrivi:int 
    presenze:int 