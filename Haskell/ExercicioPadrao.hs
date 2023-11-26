module ExercicioPadrao where

elementoTuplaTriplaS1 :: (String, String, Char) -> String
elementoTuplaTriplaS1 (s, _, _) = s

elementoTuplaTriplaS2 :: (String, String, Char) -> String
elementoTuplaTriplaS2 (_, s2, _) = s2

elementoTuplaTriplaC :: (String, String, Char) -> Char
elementoTuplaTriplaC (_, _, ch) = ch

criaLista :: Int -> [(String, String, Char)]
criaLista x
  | x > 0 && x < 6 = criaLista (x - 1) ++ [base x]
  | otherwise = []

base :: Int -> (String, String, Char)
base x
  | x == 1 = ("joao", "mestre", 'm')
  | x == 2 = ("jonas", "doutor", 'm')
  | x == 3 = ("joice", "mestre", 'f')
  | x == 4 = ("janete", "doutor", 'f')
  | x == 5 = ("jocileide", "doutor", 'f')
  | otherwise = ("ninguem", "x", 'x')

verificaMestre :: (String, String, Char) -> Bool
verificaMestre (_, stringTeste, _)
  | stringTeste == "mestre" = True
  | otherwise = False

verificaDoc :: (String, String, Char) -> Bool
verificaDoc (_, stringTeste, _)
  | stringTeste == "doutor" = True
  | otherwise = False

contMestre :: [(String, String, Char)] -> Int
contMestre [] = 0
contMestre (h : t)
  | verificaMestre h == True = 1 + contMestre t
  | otherwise = contMestre t

contDoc :: [(String, String, Char)] -> Int
contDoc [] = 0
contDoc (h : t)
  | verificaDoc h == True = 1 + contDoc t
  | otherwise = contDoc t

contMD :: [(String, String, Char)] -> String -> Int
contMD [] _ = 0
contMD x titulo
  | titulo == "doutor" = contDoc x
  | titulo == "mestre" = contMestre x
  | otherwise = 0

type Nome = String

type Titulo = String

type Genero = Char

type Pesquisador = (Nome, Titulo, Genero)

type Grupo = [Pesquisador]

criaGrupo :: Int -> Grupo
criaGrupo x
  | x > 0 && x < 6 = criaGrupo (x - 1) ++ [base x]
  | otherwise = []

grupoDoutor :: Grupo -> Grupo
grupoDoutor [] = []
grupoDoutor lista = [x | x <- lista, verificaDoc x == True]
