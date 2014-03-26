{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer-api.html",
   :name "clojure.tools.analyzer",
   :doc
   "Analyzer for clojure code, host agnostic.\n\nEntry point:\n* analyze\n\nPlatform implementers must provide dynamic bindings for:\n* macroexpand-1\n* parse\n* create-var\n* var?\n\nSee clojure.tools.analyzer.core-test for an example on how to setup the analyzer."}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.ast-api.html",
   :name "clojure.tools.analyzer.ast",
   :doc "Utilities for AST walking/updating"}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.ast.query-api.html",
   :name "clojure.tools.analyzer.ast.query",
   :doc "Utilities for querying tools.analyzer ASTs with Datomic"}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/49b163e2c56a84897a784b35db211549471f3c19/src/main/clojure/clojure/tools/analyzer/passes/add_binding_atom.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.add-binding-atom-api.html",
   :name "clojure.tools.analyzer.passes.add-binding-atom",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/e8d7eaf180f22d568bc43418f353825b3941ed91/src/main/clojure/clojure/tools/analyzer/passes/collect.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.collect-api.html",
   :name "clojure.tools.analyzer.passes.collect",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/81c7de46608f651eefc885cfdcf05aa7be323e7d/src/main/clojure/clojure/tools/analyzer/passes/constant_lifter.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.constant-lifter-api.html",
   :name "clojure.tools.analyzer.passes.constant-lifter",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/c8628b356c790903d7997a4a92e2cbb37805e485/src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.elide-meta-api.html",
   :name "clojure.tools.analyzer.passes.elide-meta",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.emit-form-api.html",
   :name "clojure.tools.analyzer.passes.emit-form",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/index_vector_nodes.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.index-vector-nodes-api.html",
   :name "clojure.tools.analyzer.passes.index-vector-nodes",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/source_info.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.source-info-api.html",
   :name "clojure.tools.analyzer.passes.source-info",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/trim.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.trim-api.html",
   :name "clojure.tools.analyzer.passes.trim",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/19b9d42b575c63a5a19878f45772210c6a125068/src/main/clojure/clojure/tools/analyzer/passes/uniquify.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.uniquify-api.html",
   :name "clojure.tools.analyzer.passes.uniquify",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/49b163e2c56a84897a784b35db211549471f3c19/src/main/clojure/clojure/tools/analyzer/passes/warn_earmuff.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.passes.warn-earmuff-api.html",
   :name "clojure.tools.analyzer.passes.warn-earmuff",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer/clojure.tools.analyzer.utils-api.html",
   :name "clojure.tools.analyzer.utils",
   :doc nil}),
 :vars
 ({:file "src/main/clojure/clojure/tools/analyzer.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L26",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/-parse",
   :namespace "clojure.tools.analyzer",
   :line 26,
   :var-type "multimethod",
   :doc
   "Takes a form and an env map and dispatches on the head of the form, that is\na special form.",
   :name "-parse"}
  {:arglists ([form env]),
   :name "analyze",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L32",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/analyze",
   :doc
   "Given a form to analyze and an environment, a map containing:\n* :locals     a map from binding symbol to AST of the binding value\n* :context    a keyword describing the form's context, one of:\n ** :return     the form is in return position\n ** :statement  the return value of the form is not needed\n ** :expr       everything else\n* :ns         a symbol representing the current namespace of the form to be\n              analyzed, must be present in the :namespaces map\n* :namespaces an atom containing a map from namespace symbol to namespace map,\n              the namespace map contains the following keys:\n ** :mappings   a map of mappings of the namespace, symbol to var/class\n ** :aliases    a map of the aliases of the namespace, symbol to symbol\n ** :ns         a symbol representing the namespace\n\nreturns an AST for that form.\n\nEvery node in the AST is a map that is *guaranteed* to have the following keys:\n* :op   a keyword describing the AST node\n* :form the form represented by the AST node\n* :env  the environment map of the AST node\n\nAdditionaly if the AST node contains sub-nodes, it is guaranteed to have:\n* :children a vector of the keys of the AST node mapping to the sub-nodes,\n            ordered, when that makes sense\n\nIt is considered a node either the top-level map or a node that can be\nreached via :children; if a node contains a node-like map that is not reachable\nby :children, there's no guarantee that such a map will contain the guaranteed keys.",
   :var-type "function",
   :line 32,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([env]),
   :name "analyze-in-env",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L93",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/analyze-in-env",
   :doc
   "Takes an env map and returns a function that analyzes a form in that env",
   :var-type "function",
   :line 93,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([sym env]),
   :name "create-var",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L109",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/create-var",
   :doc "Creates a var for sym and returns it",
   :var-type "function",
   :line 109,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([]),
   :name "empty-env",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L82",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/empty-env",
   :doc "Returns an empty env",
   :var-type "function",
   :line 82,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([form env]),
   :name "macroexpand",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L194",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/macroexpand",
   :doc
   "Repeatedly calls macroexpand-1 on form until it no longer\nrepresents a macro form, then returns it.",
   :var-type "function",
   :line 194,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([form env]),
   :name "macroexpand-1",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L98",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/macroexpand-1",
   :doc
   "If form represents a macro form, returns its expansion,\nelse returns form.",
   :var-type "function",
   :line 98,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([[op & args] env]),
   :name "parse",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L104",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/parse",
   :doc "Multimethod that dispatches on op, should default to -parse",
   :var-type "function",
   :line 104,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:file "src/main/clojure/clojure/tools/analyzer.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L188",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/specials",
   :namespace "clojure.tools.analyzer",
   :line 188,
   :var-type "var",
   :doc "Set of special forms common to every clojure variant",
   :name "specials"}
  {:arglists ([obj]),
   :name "var?",
   :namespace "clojure.tools.analyzer",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj#L114",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/2c6734f2fff7776e2c9f5772c1e42637c1e68f4c/src/main/clojure/clojure/tools/analyzer.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer/var?",
   :doc
   "Returns true if obj represent a var form as returned by create-var",
   :var-type "function",
   :line 114,
   :file "src/main/clojure/clojure/tools/analyzer.clj"}
  {:arglists ([ast]),
   :name "ast->eav",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L88",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/ast->eav",
   :doc
   "Returns an EAV representation of the current AST that can be used by\nDatomic's Datalog.",
   :var-type "function",
   :line 88,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([ast]),
   :name "children",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L32",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/children",
   :doc
   "Return a vector of the children expression of the AST node, if it has any.\nThe children expressions are kept in order and flattened so that the returning\nvector contains only nodes and not vectors of nodes.",
   :var-type "function",
   :line 32,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([{:keys [children], :as ast}]),
   :name "children*",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L24",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/children*",
   :doc
   "Return a vector of the children expression of the AST node, if it has any.\nThe returned vector returns the childrens in the order as they appear in the\n:children field of the AST, and may be either a node or a vector of nodes.",
   :var-type "function",
   :line 24,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([& fns*]),
   :name "cycling",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L12",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/cycling",
   :doc
   "Combine the given passes in a single pass that will be repeatedly\napplied to the AST until applying it another time will have no effect",
   :var-type "function",
   :line 12,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([ast]),
   :name "nodes",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L82",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/nodes",
   :doc
   "Returns a lazy-seq of all the nodes in the given AST, in depth-first pre-order.",
   :var-type "function",
   :line 82,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([ast f] [ast f reversed?]),
   :name "postwalk",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L75",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/postwalk",
   :doc "Shorthand for (walk ast identity f reversed?)",
   :var-type "function",
   :line 75,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([ast f]),
   :name "prewalk",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L70",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/prewalk",
   :doc "Shorthand for (walk ast f identity)",
   :var-type "function",
   :line 70,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([ast f] [ast f fix]),
   :name "update-children",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L40",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/update-children",
   :doc
   "Applies `f` to the nodes in the AST nodes children.\nOptionally applies `fix` to the children before applying `f` to the\nchildren nodes and then applies `fix` to the update children.\nAn example of a useful `fix` function is `rseq`.",
   :var-type "function",
   :line 40,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([ast pre post] [ast pre post reversed?]),
   :name "walk",
   :namespace "clojure.tools.analyzer.ast",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj#L59",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/ast.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast/walk",
   :doc
   "Walk the ast applying pre when entering the nodes, and post when exiting.\nIf reversed? is not-nil, pre and post will be applied starting from the last\nchildren of the AST node to the first one.",
   :var-type "function",
   :line 59,
   :file "src/main/clojure/clojure/tools/analyzer/ast.clj"}
  {:arglists ([asts]),
   :name "db",
   :namespace "clojure.tools.analyzer.ast.query",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj#L77",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast.query/db",
   :doc
   "Given a list of ASTs, returns a representation of those\nthat can be used as a database in a Datomic Datalog query",
   :var-type "function",
   :line 77,
   :file "src/main/clojure/clojure/tools/analyzer/ast/query.clj"}
  {:arglists ([query asts & inputs]),
   :name "q",
   :namespace "clojure.tools.analyzer.ast.query",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj#L83",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast.query/q",
   :doc
   "Execute a Datomic Datalog query against the ASTs.\nThe first input is always assumed to be an AST database, if more\nare required, it's required to call `db` on them.\n`unfold-expression-clauses` is automatically applied to the\nquery.",
   :var-type "function",
   :line 83,
   :file "src/main/clojure/clojure/tools/analyzer/ast/query.clj"}
  {:arglists ([query]),
   :name "query-map",
   :namespace "clojure.tools.analyzer.ast.query",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj#L14",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast.query/query-map",
   :doc
   "Transoforms a Datomic query from its vector representation to its map one.\nIf the given query is already in its map representation, the original query\nis returned.",
   :var-type "function",
   :line 14,
   :file "src/main/clojure/clojure/tools/analyzer/ast/query.clj"}
  {:arglists ([query]),
   :name "resolve-calls",
   :namespace "clojure.tools.analyzer.ast.query",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj#L59",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast.query/resolve-calls",
   :doc
   "Automatically replace fn name symbols in expression clauses with\ntheir namespace qualified one if the symbol can be resolved in the\ncurrent namespace.",
   :var-type "function",
   :line 59,
   :file "src/main/clojure/clojure/tools/analyzer/ast/query.clj"}
  {:arglists ([query]),
   :name "unfold-expression-clauses",
   :namespace "clojure.tools.analyzer.ast.query",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj#L29",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/87bc3a0a8faff84362e2cbd43e20774e869343fb/src/main/clojure/clojure/tools/analyzer/ast/query.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.ast.query/unfold-expression-clauses",
   :doc
   "Given a Datomic query, walk the :where clauses searching for\nexpression clauses with nested calls, unnesting those calls.\n\nE.g {:where [[(inc (dec ?foo)) ?bar] ..] ..} will be transformed in\n{:where [[(dec ?foo) ?1234] [(inc ?1234) ?bar] ..] ..}",
   :var-type "function",
   :line 29,
   :file "src/main/clojure/clojure/tools/analyzer/ast/query.clj"}
  {:arglists ([ast]),
   :name "add-binding-atom",
   :namespace "clojure.tools.analyzer.passes.add-binding-atom",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/49b163e2c56a84897a784b35db211549471f3c19/src/main/clojure/clojure/tools/analyzer/passes/add_binding_atom.clj#L26",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/49b163e2c56a84897a784b35db211549471f3c19/src/main/clojure/clojure/tools/analyzer/passes/add_binding_atom.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.add-binding-atom/add-binding-atom",
   :doc
   "Walks the AST and adds an atom-backed-map to every local binding,\nthe same atom will be shared between all occurences of that local.\n\nThe atom is put in the :atom field of the node.",
   :var-type "function",
   :line 26,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/add_binding_atom.clj"}
  {:arglists ([{:keys [what top-level?], :as opts}]),
   :name "collect",
   :namespace "clojure.tools.analyzer.passes.collect",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/e8d7eaf180f22d568bc43418f353825b3941ed91/src/main/clojure/clojure/tools/analyzer/passes/collect.clj#L148",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/e8d7eaf180f22d568bc43418f353825b3941ed91/src/main/clojure/clojure/tools/analyzer/passes/collect.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.collect/collect",
   :doc
   "Takes a map with:\n* :what        set of keywords describing what to collect, some of:\n  ** :constants     constant expressions\n  ** :closed-overs  closed over local bindings\n  ** :callsites     keyword and protocol callsites\n* :where       set of :op nodes where to attach collected info\n* :top-level?  if true attach collected info to the top-level node\n\nReturns a function that does the takes an AST and returns an AST with the\ncollected info.",
   :var-type "function",
   :line 148,
   :file "src/main/clojure/clojure/tools/analyzer/passes/collect.clj"}
  {:arglists ([ast opts]),
   :name "collect-closed-overs",
   :namespace "clojure.tools.analyzer.passes.collect",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/e8d7eaf180f22d568bc43418f353825b3941ed91/src/main/clojure/clojure/tools/analyzer/passes/collect.clj#L130",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/e8d7eaf180f22d568bc43418f353825b3941ed91/src/main/clojure/clojure/tools/analyzer/passes/collect.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.collect/collect-closed-overs",
   :doc
   "Takes an AST and an opts map that takes the same options as collect,\nbut only collects closed-overs on the AST.",
   :var-type "function",
   :line 130,
   :file "src/main/clojure/clojure/tools/analyzer/passes/collect.clj"}
  {:file
   "src/main/clojure/clojure/tools/analyzer/passes/constant_lifter.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/81c7de46608f651eefc885cfdcf05aa7be323e7d/src/main/clojure/clojure/tools/analyzer/passes/constant_lifter.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/81c7de46608f651eefc885cfdcf05aa7be323e7d/src/main/clojure/clojure/tools/analyzer/passes/constant_lifter.clj#L13",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.constant-lifter/constant-lift",
   :namespace "clojure.tools.analyzer.passes.constant-lifter",
   :line 13,
   :var-type "multimethod",
   :doc
   "If the node represents a collection with no metadata, and every item of that\ncollection is a literal, transform the node to an equivalent :const node.",
   :name "constant-lift"}
  {:arglists ([ast]),
   :name "elide-meta",
   :namespace "clojure.tools.analyzer.passes.elide-meta",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/c8628b356c790903d7997a4a92e2cbb37805e485/src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj#L47",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/c8628b356c790903d7997a4a92e2cbb37805e485/src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.elide-meta/elide-meta",
   :doc
   "If elides is not empty and the AST node contains metadata,\ndissoc all the keys in elides from the metadata.",
   :var-type "function",
   :line 47,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj"}
  {:name "elides",
   :namespace "clojure.tools.analyzer.passes.elide-meta",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/c8628b356c790903d7997a4a92e2cbb37805e485/src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj#L11",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/c8628b356c790903d7997a4a92e2cbb37805e485/src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.elide-meta/elides",
   :doc
   "Set of map keys to elide from metadata.\nDefaults to (set (:elide-meta *compiler-options*))",
   :var-type "var",
   :line 11,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/elide_meta.clj"}
  {:arglists ([{:keys [form], :as ast} hygienic?]),
   :name "-emit-form*",
   :namespace "clojure.tools.analyzer.passes.emit-form",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj#L13",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.emit-form/-emit-form*",
   :doc
   "Extension point for custom emit-form implementations, should be rebound\nto a multimethod with custom emit-form :ops.",
   :var-type "function",
   :line 13,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj"}
  {:arglists ([ast]),
   :name "emit-form",
   :namespace "clojure.tools.analyzer.passes.emit-form",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj#L23",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.emit-form/emit-form",
   :doc "Return the form represented by the given AST",
   :var-type "function",
   :line 23,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj"}
  {:arglists ([ast]),
   :name "emit-hygienic-form",
   :namespace "clojure.tools.analyzer.passes.emit-form",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj#L28",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.emit-form/emit-hygienic-form",
   :doc "Return an hygienic form represented by the given AST",
   :var-type "function",
   :line 28,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/emit_form.clj"}
  {:arglists ([ast]),
   :name "index-vector-nodes",
   :namespace "clojure.tools.analyzer.passes.index-vector-nodes",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/index_vector_nodes.clj#L11",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/index_vector_nodes.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.index-vector-nodes/index-vector-nodes",
   :doc
   "Adds an :idx attribute to nodes in a vector children, representing the position\nof the node vector.",
   :var-type "function",
   :line 11,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/index_vector_nodes.clj"}
  {:arglists ([ast]),
   :name "source-info",
   :namespace "clojure.tools.analyzer.passes.source-info",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/source_info.clj#L12",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/source_info.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.source-info/source-info",
   :doc
   "Adds (when avaliable) :line, :column and :file info to the AST :env",
   :var-type "function",
   :line 12,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/source_info.clj"}
  {:file "src/main/clojure/clojure/tools/analyzer/passes/trim.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/trim.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/passes/trim.clj#L12",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.trim/trim",
   :namespace "clojure.tools.analyzer.passes.trim",
   :line 12,
   :var-type "multimethod",
   :doc
   "Trims the AST from duplicate :do nodes or useless :let nodes.\nWARNING: Still experimental, possibly useful metadata-stored info\n         might get lost",
   :name "trim"}
  {:arglists ([ast]),
   :name "uniquify-locals",
   :namespace "clojure.tools.analyzer.passes.uniquify",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/19b9d42b575c63a5a19878f45772210c6a125068/src/main/clojure/clojure/tools/analyzer/passes/uniquify.clj#L77",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/19b9d42b575c63a5a19878f45772210c6a125068/src/main/clojure/clojure/tools/analyzer/passes/uniquify.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.uniquify/uniquify-locals",
   :doc
   "Walks the AST performing alpha-conversion on the :name field\nof :local/:binding nodes, invalidates :local map in :env field",
   :var-type "function",
   :line 77,
   :file "src/main/clojure/clojure/tools/analyzer/passes/uniquify.clj"}
  {:arglists ([ast]),
   :name "warn-earmuff",
   :namespace "clojure.tools.analyzer.passes.warn-earmuff",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/49b163e2c56a84897a784b35db211549471f3c19/src/main/clojure/clojure/tools/analyzer/passes/warn_earmuff.clj#L12",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/49b163e2c56a84897a784b35db211549471f3c19/src/main/clojure/clojure/tools/analyzer/passes/warn_earmuff.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.passes.warn-earmuff/warn-earmuff",
   :doc
   "Prints a warning to *err* if the AST node is a :def node and the\nvar name contains earmuffs but the var is not marked dynamic",
   :var-type "function",
   :line 12,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/warn_earmuff.clj"}
  {:arglists ([x env]),
   :name "-source-info",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L128",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/-source-info",
   :doc "Returns the source-info of x",
   :var-type "function",
   :line 128,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([fn argc]),
   :name "arglist-for-arity",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L108",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/arglist-for-arity",
   :doc "Takes a fn node and an argc and returns the matching arglist",
   :var-type "function",
   :line 108,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x]),
   :name "boolean?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L40",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/boolean?",
   :doc "Returns true if x is a boolean",
   :var-type "function",
   :line 40,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([form]),
   :name "classify",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L45",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/classify",
   :doc "Returns a keyword describing the form type",
   :var-type "function",
   :line 45,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([{:keys [op val expr]}]),
   :name "const-val",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L145",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/const-val",
   :doc
   "Returns the value of a constant node (either :quote or :const)",
   :var-type "function",
   :line 145,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([var]),
   :name "constant?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L75",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/constant?",
   :doc "Returns true if the var is a const",
   :var-type "function",
   :line 75,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([env ctx]),
   :name "ctx",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L15",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/ctx",
   :doc
   "Returns a copy of the passed environment with :context set to ctx",
   :var-type "function",
   :line 15,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([var]),
   :name "dynamic?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L79",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/dynamic?",
   :doc "Returns true if the var is dynamic",
   :var-type "function",
   :line 79,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x env]),
   :name "get-col",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L123",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/get-col",
   :doc "Returns the column number of x",
   :var-type "function",
   :line 123,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x env]),
   :name "get-line",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L119",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/get-line",
   :doc "Returns the line number of x",
   :var-type "function",
   :line 119,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([var]),
   :name "macro?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L71",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/macro?",
   :doc "Returns true if the var maps to a macro",
   :var-type "function",
   :line 71,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x]),
   :name "obj?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L28",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/obj?",
   :doc "Returns true if x implements IObj",
   :var-type "function",
   :line 28,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([var]),
   :name "private?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L67",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/private?",
   :doc "Returns true if the var is private",
   :var-type "function",
   :line 67,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([var]),
   :name "protocol-node?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L85",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/protocol-node?",
   :doc "Returns true if the var maps to a protocol function",
   :var-type "function",
   :line 85,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x]),
   :name "record?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L20",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/record?",
   :doc "Returns true if x is a record",
   :var-type "function",
   :line 20,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x]),
   :name "reference?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L32",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/reference?",
   :doc "Returns true if x implements IReference",
   :var-type "function",
   :line 32,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x]),
   :name "regex?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L36",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/regex?",
   :doc "Returns true if x is a regex",
   :var-type "function",
   :line 36,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([ns-sym {:keys [ns namespaces]}]),
   :name "resolve-ns",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L90",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/resolve-ns",
   :doc "Resolves the ns mapped by the given sym in the env",
   :var-type "function",
   :line 90,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([sym {:keys [ns namespaces], :as env}]),
   :name "resolve-var",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/resolve-var",
   :doc "Resolves the var mapped by the given sym in the env",
   :var-type "function",
   :line 97,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([env]),
   :name "source-info",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L140",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/source-info",
   :doc "Returns the source-info from an env",
   :var-type "function",
   :line 140,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"}
  {:arglists ([x]),
   :name "type?",
   :namespace "clojure.tools.analyzer.utils",
   :source-url
   "https://github.com/clojure/tools.analyzer/blob/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj#L24",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer/raw/fba761428d27ce927c5d5237778dfd0162376c62/src/main/clojure/clojure/tools/analyzer/utils.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer//clojure.tools.analyzer-api.html#clojure.tools.analyzer.utils/type?",
   :doc "Returns true if x is a type",
   :var-type "function",
   :line 24,
   :file "src/main/clojure/clojure/tools/analyzer/utils.clj"})}
