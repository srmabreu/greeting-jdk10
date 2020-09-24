## Experimental Java-Based JIT Compiler (JEP 317)

This feature enables the Java-based JIT compiler, Graal, to be used as an experimental JIT compiler on the Linux/x64 platform

## Application Class-Data Sharing (JEP 310)

JVM while starting performs some preliminary steps, one of which is loading classes in memory. If there are several jars having multiple classes, then the lag in the first request is clearly visible. This becomes an issue with serverless architecture, where the boot time is critical. In order to bring down application startup time, Application class-data sharing can be used. The idea is to reduce footprint by sharing common class metadata across different Java processes.

## Parallel Full GC for G1 (JEP 307)

This change improves the G1 worst-case latency by making the full GC parallel. The mark-sweep-compact algorithm from G1 collector is parallelized as part of this change and will be triggered when concurrent threads for collection can’t revive the memory fast enough.

## Garbage-Collector Interface (JEP 304)

This change provides better modularity to the Internal GC Code. It will help in the future for adding new GC without changing existing codebase, also help in removing or housekeeping of the previous GC.

## Additional Unicode Language-Tag Extensions (JEP 314)

This feature enhances java.util.Locale and related APIs to implement additional Unicode extensions of BCP 47 language tags. As of Java SE 9, the supported BCP 47 U language-tag extensions are “ca” and “nu”. 

## Root Certificates (JEP 319)

In order to promote OpenJDK and make it more appealing to community users, this feature provides a default set of root Certification Authority (CA) certificates in the JDK. This will also mean that both Oracle & Open JDK binaries will be functionally the same.

## Thread-Local Handshakes (JEP 312)

This feature provides a way to execute a callback on threads without performing a global VM safepoint. Make it both possible and cheap to stop individual threads and not just all threads or none.

## Heap Allocation on Alternative Memory Devices (JEP 316)

This feature enhances the capability of HotSpot VM to allocate the Java object heap on an alternative memory device, such as an NV-DIMM, specified by the user.

## Remove the Native-Header Generation Tool – javah (JEP 313)

The tool functionality is added in javac as part of JDK 8, which provides ability to write native header files at the compile-time rendering javah useless.

## Consolidate the JDK Forest into a Single Repository (JEP 296)

As part of this change, numerous repositories of the JDK forest are combined into a single repository in order to simplify and streamline development.

