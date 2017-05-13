<#--抗生素知识图谱【英文】 知识地图展示部分-->
<@override name='baseTile'>antibioticKG</@override>

<@override name="baseDomain">
<input type="hidden" id="graph" name="graph" value="antibiotic">
</@override>


<@override name='recommendation'>
    <a href="/search?keywords=AmBisome&amp;graph=antibiotic">AmBisome</a> 
    <a href="/search?keywords=Amoxycillin&amp;graph=antibiotic">Amoxycillin</a> 
    <a href="/search?keywords=Flucloxacillin&amp;graph=antibiotic">Flucloxacillin</a>
    </@override>




<@override name="baseBody">
<h2>搜说关键词为： ${test!"null"}</h2>
<div class="row">
    <div class="col-md-8">
        <div class="panel panel-primary">
            <div class="panel-heading">
                Graph
            </div>
            <div class="panel-body">
                <div id="knowledgeGraph" style="height:600px">

                </div>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="panel panel-danger">
            <div class="panel-heading">
                Description
            </div>
            <div class="panel-body" >
                <div id="description" style="height:600px; overflow-y:auto;">
                    <p>&lt;&lt;点击节点或边,可查看相关知识。</p>
                </div>
            </div>
        </div>
    </div>
</div>

</@override>

<@extends name='base.ftl'/>