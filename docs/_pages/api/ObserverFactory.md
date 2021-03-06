---
title: ObserverFactory
permalink: /api/ObserverFactory/
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
<a href="{{ '/api/za.ac.sun.cs.coastal.symbolic.exceptions/' | relative_url }}">za.ac.sun.cs.coastal.symbolic.exceptions</a></li>
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
<section class="main class">
<h1>{{ page.title | escape }}</h1>
<h2><a class="anchor" name="ONCE_PER_RUN"></a>ONCE_PER_RUN</h2>
<div markdown="1">
~~~java
public static final int ONCE_PER_RUN = 1
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="ONCE_PER_TASK"></a>ONCE_PER_TASK</h2>
<div markdown="1">
~~~java
public static final int ONCE_PER_TASK = 2
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="ONCE_PER_DIVER"></a>ONCE_PER_DIVER</h2>
<div markdown="1">
~~~java
public static final int ONCE_PER_DIVER = 4
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="ONCE_PER_SURFER"></a>ONCE_PER_SURFER</h2>
<div markdown="1">
~~~java
public static final int ONCE_PER_SURFER = 8
~~~
</div>
<p>
</p>
<h2><a class="anchor" name="getFrequencyflags()"></a>getFrequencyflags</h2>
<div markdown="1">
~~~java
public int getFrequencyflags()
~~~
</div>
<h2><a class="anchor" name="createManager(COASTAL)"></a>createManager</h2>
<div markdown="1">
~~~java
public observers.ObserverFactory.ObserverManager createManager(COASTAL coastal)
~~~
</div>
<h4>Parameters</h4>
<table class="parameters">
<tbody>
<tr>
<td>
coastal<br/><span class="paramtype">COASTAL</span></td>
<td>
</td>
</tr>
</tbody>
</table>
<h2><a class="anchor" name="createObserver(COASTAL, ObserverFactory.ObserverManager)"></a>createObserver</h2>
<div markdown="1">
~~~java
public observers.ObserverFactory.Observer createObserver(COASTAL coastal, observers.ObserverFactory.ObserverManager manager)
~~~
</div>
<h4>Parameters</h4>
<table class="parameters">
<tbody>
<tr>
<td>
coastal<br/><span class="paramtype">COASTAL</span></td>
<td>
</td>
</tr>
<tr>
<td>
manager<br/><span class="paramtype">observers.ObserverFactory.ObserverManager</span></td>
<td>
</td>
</tr>
</tbody>
</table>
</section>
<section class="apitoc">
<ul class="section-nav">
<li class="toc-entry toc-h2">
Constants<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#ONCE_PER_DIVER">ONCE_PER_DIVER</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#ONCE_PER_RUN">ONCE_PER_RUN</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#ONCE_PER_SURFER">ONCE_PER_SURFER</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#ONCE_PER_TASK">ONCE_PER_TASK</a></li>
</ul>
</li>
<li class="toc-entry toc-h2">
Methods<ul>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#createManager(COASTAL)">createManager(COASTAL)</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#createObserver(COASTAL, ObserverFactory.ObserverManager)">createObserver(COASTAL, ObserverFactory.ObserverManager)</a></li>
<li class="toc-entry toc-h3">
<a href="{{ '/api/ObserverFactory/' | relative_url }}#getFrequencyflags()">getFrequencyflags()</a></li>
</ul>
</li>

</ul>
</section>
