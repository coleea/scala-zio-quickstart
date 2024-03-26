file://<WORKSPACE>/src/main/scala/example/Main.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.1/scala3-library_3-3.3.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 438
uri: file://<WORKSPACE>/src/main/scala/example/Main.scala
text:
```scala
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

  def run: IO[IOException, Unit] = 

    for {
      a(@@)
    _ <- Console.printLine("Hello, World!")
     _ <- Console.printLine("ends")
    } yield ()

  }


  
// @main def main(args: String*): Unit =
//   println(s"Hello ${args.mkString}")

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.countParams(Signatures.scala:501)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:186)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:94)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:63)
	scala.meta.internal.pc.MetalsSignatures$.signatures(MetalsSignatures.scala:17)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:51)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:398)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0