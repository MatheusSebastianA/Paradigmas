module Operacoes where

multiplica :: Int -> Int -> Int
multiplica x y = x * y

soma :: Int -> Int -> Int
soma x y = x + y

cubo :: Int -> Int
cubo x = x * x * x

quadrado :: Int -> Int
quadrado x = x * x

ehPar :: Int -> Bool
ehPar x =
  if mod x 2 == 0
    then True
    else False

ehParGuarda :: Int -> Bool
ehParGuarda x
  | mod x 2 == 0 = True
  | otherwise = False

ehImpar :: Int -> Bool
ehImpar x
  | mod x 2 == 1 = True
  | otherwise = False

formaTriangulo :: Int -> Int -> Int -> Bool
formaTriangulo a b c
  | a + b > c && a + c > b && b + c > a = True
  | otherwise = False

formaTrianguloIf :: Int -> Int -> Int -> Bool
formaTrianguloIf a b c =
  if a + b > c && a + c > b && b + c > a
    then True
    else False

media :: Float -> Float -> Float -> String
media x y z
  | media >= 7 = "Aprovado"
  | otherwise = "Reprovado"
  where
    media = (x + y + z) / 3

fatRecursivo :: Int -> Int
fatRecursivo x
  | x <= 1 = 1
  | otherwise = x * fatRecursivo (x - 1)

comprimentoLista :: [Int] -> Int
comprimentoLista [] = 0
comprimentoLista (h : t) = 1 + comprimentoLista t

cuboDaLista :: [Int] -> [Int]
cuboDaLista [] = []
cuboDaLista (head : tail) = (head * head * head) : cuboDaLista tail

verificaChar :: [Char] -> Char -> Bool
verificaChar [] ch = False
verificaChar (head : tail) ch
  | head == ch = True
  | otherwise = verificaChar tail ch

dezPrimeirosMult :: Int -> [Int]
dezPrimeirosMult n = [n * i | i <- [1 .. 10]]

ehPrimo :: Int -> Bool
ehPrimo x = comprimentoLista [n | n <- [1 .. x], mod x n == 0] == 2

tuplaParImpar :: [Int] -> (Int, Int)
tuplaParImpar [] = (0, 0)
tuplaParImpar (h : t)
  | mod h 2 == 0 = (par + 1, impar)
  | otherwise = (par, impar + 1)
  where
    (par, impar) = tuplaParImpar t

type MediaNota = Int

type Aluno = (String, MediaNota)

type Turma = [Aluno]

aprovados :: Turma -> Int -> [String]
aprovados turma nota = [nome | (nome, media) <- turma, media >= nota]

func :: (Int, (Int, Int)) -> Int
func z =
  if fst z == 1
    then fst (snd z) + snd (snd z)
    else
      if fst z == 2
        then fst (snd z) - snd (snd z)
        else 0

funcCoringa :: (Int, (Int, Int)) -> Int
funcCoringa (1, (x, y)) = x + y
funcCoringa (2, (x, y)) = x - y
funcCoringa (_) = 0

mapLista :: (Int -> Int) -> [Int] -> [Int]
mapLista _ [] = []
mapLista f (head : tail) = (f head) : mapLista f tail

filtroLista :: (Int -> Bool) -> [Int] -> [Int]
filtroLista _ [] = []
filtroLista f (head : tail)
  | (f head) == True = (filtroLista f tail) ++ [head]
  | otherwise = filtroLista f tail
