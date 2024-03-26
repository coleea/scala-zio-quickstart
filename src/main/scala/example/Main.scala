package example

import java.io.IOException
import zio._

object 아무이름 extends ZIOAppDefault {
    // def run: IO[IOException, Unit] = {
    //   println("raw print")
    //   Console.printLine("Hello, World!")
    //   Console.printLine("end1")
    //   Console.printLine("end2")
    //   Console.printLine("end3")
    // }

  def a() : Unit = {
    println("some hello print")
  }

  def run: ZIO[Any, IOException, Unit] = 

    for {
    _ <- Console.printLine("Hello, World!")
     _ <- Console.printLine("ends")
    } yield ( a())

  }


  
// @main def main(args: String*): Unit =
//   println(s"Hello ${args.mkString}")
