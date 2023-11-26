module Nome where

adicionaSr :: String -> String
adicionaSr str = "Sr." ++ str

adicionaSra :: String -> String
adicionaSra str = "Sra." ++ str

adicionaSrta :: String -> String
adicionaSrta str = "Srta." ++ str

mapeamentoNomes :: [String] -> (String -> String) -> [String]
mapeamentoNomes[] _ = []
mapeamentoNomes (head:tail) func = func head : mapeamentoNomes tail func
