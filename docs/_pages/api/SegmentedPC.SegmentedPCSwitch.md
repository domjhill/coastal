---
title: SegmentedPC.SegmentedPCSwitch
permalink: /api/SegmentedPC.SegmentedPCSwitch/
toc: true
---

<section class="sidetoc">
<ul class="section-nav">
<li class="toc-entry toc-h2">
<a class="top" href="{{ '/api/' | relative_url }}">API home</a>
</li>
<li class="toc-entry toc-h2">
COASTAL<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal/' | relative_url }}">za.ac.sun.cs.coastal</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.diver/' | relative_url }}">za.ac.sun.cs.coastal.diver</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.instrument/' | relative_url }}">za.ac.sun.cs.coastal.instrument</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.messages/' | relative_url }}">za.ac.sun.cs.coastal.messages</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.model/' | relative_url }}">za.ac.sun.cs.coastal.model</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.observers/' | relative_url }}">za.ac.sun.cs.coastal.observers</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.pathtree/' | relative_url }}">za.ac.sun.cs.coastal.pathtree</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.solver/' | relative_url }}">za.ac.sun.cs.coastal.solver</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.strategy/' | relative_url }}">za.ac.sun.cs.coastal.strategy</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.strategy.hybrid/' | relative_url }}">za.ac.sun.cs.coastal.strategy.hybrid</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.strategy.pathbased/' | relative_url }}">za.ac.sun.cs.coastal.strategy.pathbased</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.strategy.tracebased/' | relative_url }}">za.ac.sun.cs.coastal.strategy.tracebased</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.surfer/' | relative_url }}">za.ac.sun.cs.coastal.surfer</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.symbolic/' | relative_url }}">za.ac.sun.cs.coastal.symbolic</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/za.ac.sun.cs.coastal.utility/' | relative_url }}">za.ac.sun.cs.coastal.utility</a></li>
</ul>
</li>
<li class="toc-entry toc-h2">
Examples<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.bintree/' | relative_url }}">examples.bintree</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.fuzzing/' | relative_url }}">examples.fuzzing</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.jcute/' | relative_url }}">examples.jcute</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.kmp/' | relative_url }}">examples.kmp</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.learning/' | relative_url }}">examples.learning</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.remainder/' | relative_url }}">examples.remainder</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.simple/' | relative_url }}">examples.simple</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.statik/' | relative_url }}">examples.statik</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/examples.strings/' | relative_url }}">examples.strings</a></li>
</ul>
</li>
</ul>
</section>
<section class="main">
<h1>{{ page.title | escape }}</h1>
<h2><a class="anchor" name="expression"></a>expression</h2>
<div markdown="1">
~~~java
private final solver.Expression expression
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="min"></a>min</h2>
<div markdown="1">
~~~java
private final long min
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="max"></a>max</h2>
<div markdown="1">
~~~java
private final long max
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="cur"></a>cur</h2>
<div markdown="1">
~~~java
private final long cur
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="activeConjunct"></a>activeConjunct</h2>
<div markdown="1">
~~~java
private final solver.Expression activeConjunct
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="signature"></a>signature</h2>
<div markdown="1">
~~~java
private final String signature
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="SegmentedPCSwitch"></a>SegmentedPCSwitch</h2>
<div markdown="1">
~~~java
public SegmentedPCSwitch(diver.SegmentedPC parent, solver.Expression expression, solver.Expression passiveConjunct, long min, long max, long cur)
~~~
</div>
<h4>Parameters</h4>
<table class="parameters">
<tbody>
<tr>
<td>
parent<br/><span class="paramtype">diver.SegmentedPC</span></td>
<td>
</td>
</tr>
<tr>
<td>
expression<br/><span class="paramtype">solver.Expression</span></td>
<td>
</td>
</tr>
<tr>
<td>
passiveConjunct<br/><span class="paramtype">solver.Expression</span></td>
<td>
</td>
</tr>
<tr>
<td>
min<br/><span class="paramtype">long</span></td>
<td>
</td>
</tr>
<tr>
<td>
max<br/><span class="paramtype">long</span></td>
<td>
</td>
</tr>
<tr>
<td>
cur<br/><span class="paramtype">long</span></td>
<td>
</td>
</tr>
</tbody>
</table>
<h2><a class="anchor" name="getExpression"></a>getExpression</h2>
<div markdown="1">
~~~java
public solver.Expression getExpression()
~~~
</div>
<h2><a class="anchor" name="getActiveConjunct"></a>getActiveConjunct</h2>
<div markdown="1">
~~~java
public solver.Expression getActiveConjunct()
~~~
</div>
<h2><a class="anchor" name="getSignature"></a>getSignature</h2>
<div markdown="1">
~~~java
public String getSignature()
~~~
</div>
<h2><a class="anchor" name="getNrOfOutcomes"></a>getNrOfOutcomes</h2>
<div markdown="1">
~~~java
public int getNrOfOutcomes()
~~~
</div>
<h2><a class="anchor" name="getOutcomeIndex"></a>getOutcomeIndex</h2>
<div markdown="1">
~~~java
public int getOutcomeIndex()
~~~
</div>
<h2><a class="anchor" name="getOutcome"></a>getOutcome</h2>
<div markdown="1">
~~~java
public String getOutcome(int index)
~~~
</div>
<h4>Parameters</h4>
<table class="parameters">
<tbody>
<tr>
<td>
index<br/><span class="paramtype">int</span></td>
<td>
</td>
</tr>
</tbody>
</table>
<h2><a class="anchor" name="getChild"></a>getChild</h2>
<div markdown="1">
~~~java
public diver.SegmentedPC getChild(int index, symbolic.Execution parent)
~~~
</div>
<h4>Parameters</h4>
<table class="parameters">
<tbody>
<tr>
<td>
index<br/><span class="paramtype">int</span></td>
<td>
</td>
</tr>
<tr>
<td>
parent<br/><span class="paramtype">symbolic.Execution</span></td>
<td>
</td>
</tr>
</tbody>
</table>
<h2><a class="anchor" name="toString0"></a>toString0</h2>
<div markdown="1">
~~~java
public String toString0()
~~~
</div>
</section>
<section class="apitoc">
<ul class="section-nav">
<li class="toc-entry toc-h2">
Fields<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#activeConjunct">activeConjunct</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#cur">cur</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#expression">expression</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#max">max</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#min">min</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#signature">signature</a></li>
</ul>
</li>
<li class="toc-entry toc-h2">
Constructors<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#SegmentedPCSwitch">SegmentedPCSwitch(SegmentedPC, Expression, Expression, long, long, long)</a></li>
</ul>
</li>
<li class="toc-entry toc-h2">
Methods<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getActiveConjunct">getActiveConjunct()</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getChild">getChild(int, Execution)</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getExpression">getExpression()</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getNrOfOutcomes">getNrOfOutcomes()</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getOutcome">getOutcome(int)</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getOutcomeIndex">getOutcomeIndex()</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#getSignature">getSignature()</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/SegmentedPC.SegmentedPCSwitch/' | relative_url }}#toString0">toString0()</a></li>
</ul>
</li>

</ul>
</section>
