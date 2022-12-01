// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class EvtAiSyncCombatThreatInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtAiSyncCombatThreatInfoNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EvtAiSyncCombatThreatInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EvtAiSyncCombatThreatInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n%EvtAiSyncCombatThreatInfoNotify.proto\u001a\u0012AiThreatInfo.proto\"\u00c7\u0001\n\u001fEvtAiSyncCombatThreatInfoNotify\u0012Y\n\u0016combat_threat_info_map\u0018\b \u0003(\u000b29.EvtAiSyncCombatThreatInfoNotify.CombatThreatInfoMapEntry\u001aI\n\u0018CombatThreatInfoMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001c\n\u0005value\u0018\u0002 \u0001(\u000b2\r.AiThreatInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EvtAiSyncCombatThreatInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AiThreatInfoOuterClass.getDescriptor() });
        internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtAiSyncCombatThreatInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor, new String[] { "CombatThreatInfoMap" });
        internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_descriptor = EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor.getNestedTypes().get(0);
        internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_descriptor, new String[] { "Key", "Value" });
        AiThreatInfoOuterClass.getDescriptor();
    }
    
    public static final class EvtAiSyncCombatThreatInfoNotify extends GeneratedMessageV3 implements EvtAiSyncCombatThreatInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMBAT_THREAT_INFO_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, AiThreatInfoOuterClass.AiThreatInfo> combatThreatInfoMap_;
        private byte memoizedIsInitialized;
        private static final EvtAiSyncCombatThreatInfoNotify DEFAULT_INSTANCE;
        private static final Parser<EvtAiSyncCombatThreatInfoNotify> PARSER;
        
        private EvtAiSyncCombatThreatInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EvtAiSyncCombatThreatInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EvtAiSyncCombatThreatInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EvtAiSyncCombatThreatInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.combatThreatInfoMap_ = MapField.newMapField(CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, AiThreatInfoOuterClass.AiThreatInfo> combatThreatInfoMap__ = input.readMessage(CombatThreatInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.combatThreatInfoMap_.getMutableMap().put(combatThreatInfoMap__.getKey(), combatThreatInfoMap__.getValue());
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 8: {
                    return this.internalGetCombatThreatInfoMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAiSyncCombatThreatInfoNotify.class, Builder.class);
        }
        
        private MapField<Integer, AiThreatInfoOuterClass.AiThreatInfo> internalGetCombatThreatInfoMap() {
            if (this.combatThreatInfoMap_ == null) {
                return MapField.emptyMapField(CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
            }
            return this.combatThreatInfoMap_;
        }
        
        @Override
        public int getCombatThreatInfoMapCount() {
            return this.internalGetCombatThreatInfoMap().getMap().size();
        }
        
        @Override
        public boolean containsCombatThreatInfoMap(final int key) {
            return this.internalGetCombatThreatInfoMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getCombatThreatInfoMap() {
            return this.getCombatThreatInfoMapMap();
        }
        
        @Override
        public Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getCombatThreatInfoMapMap() {
            return this.internalGetCombatThreatInfoMap().getMap();
        }
        
        @Override
        public AiThreatInfoOuterClass.AiThreatInfo getCombatThreatInfoMapOrDefault(final int key, final AiThreatInfoOuterClass.AiThreatInfo defaultValue) {
            final Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> map = this.internalGetCombatThreatInfoMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AiThreatInfoOuterClass.AiThreatInfo getCombatThreatInfoMapOrThrow(final int key) {
            final Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> map = this.internalGetCombatThreatInfoMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetCombatThreatInfoMap(), CombatThreatInfoMapDefaultEntryHolder.defaultEntry, 8);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Integer, AiThreatInfoOuterClass.AiThreatInfo> entry : this.internalGetCombatThreatInfoMap().getMap().entrySet()) {
                final MapEntry<Integer, AiThreatInfoOuterClass.AiThreatInfo> combatThreatInfoMap__ = CombatThreatInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, combatThreatInfoMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvtAiSyncCombatThreatInfoNotify)) {
                return super.equals(obj);
            }
            final EvtAiSyncCombatThreatInfoNotify other = (EvtAiSyncCombatThreatInfoNotify)obj;
            return this.internalGetCombatThreatInfoMap().equals(other.internalGetCombatThreatInfoMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetCombatThreatInfoMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetCombatThreatInfoMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EvtAiSyncCombatThreatInfoNotify.PARSER.parseFrom(data);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAiSyncCombatThreatInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EvtAiSyncCombatThreatInfoNotify.PARSER.parseFrom(data);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAiSyncCombatThreatInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EvtAiSyncCombatThreatInfoNotify.PARSER.parseFrom(data);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAiSyncCombatThreatInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAiSyncCombatThreatInfoNotify.PARSER, input);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAiSyncCombatThreatInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAiSyncCombatThreatInfoNotify.PARSER, input);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAiSyncCombatThreatInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAiSyncCombatThreatInfoNotify.PARSER, input);
        }
        
        public static EvtAiSyncCombatThreatInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAiSyncCombatThreatInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EvtAiSyncCombatThreatInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EvtAiSyncCombatThreatInfoNotify prototype) {
            return EvtAiSyncCombatThreatInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EvtAiSyncCombatThreatInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EvtAiSyncCombatThreatInfoNotify getDefaultInstance() {
            return EvtAiSyncCombatThreatInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EvtAiSyncCombatThreatInfoNotify> parser() {
            return EvtAiSyncCombatThreatInfoNotify.PARSER;
        }
        
        @Override
        public Parser<EvtAiSyncCombatThreatInfoNotify> getParserForType() {
            return EvtAiSyncCombatThreatInfoNotify.PARSER;
        }
        
        @Override
        public EvtAiSyncCombatThreatInfoNotify getDefaultInstanceForType() {
            return EvtAiSyncCombatThreatInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EvtAiSyncCombatThreatInfoNotify();
            PARSER = new AbstractParser<EvtAiSyncCombatThreatInfoNotify>() {
                @Override
                public EvtAiSyncCombatThreatInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EvtAiSyncCombatThreatInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class CombatThreatInfoMapDefaultEntryHolder
        {
            static final MapEntry<Integer, AiThreatInfoOuterClass.AiThreatInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, AiThreatInfoOuterClass.AiThreatInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EvtAiSyncCombatThreatInfoNotifyOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, AiThreatInfoOuterClass.AiThreatInfo> combatThreatInfoMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetCombatThreatInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetMutableCombatThreatInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAiSyncCombatThreatInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EvtAiSyncCombatThreatInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableCombatThreatInfoMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EvtAiSyncCombatThreatInfoNotifyOuterClass.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
            }
            
            @Override
            public EvtAiSyncCombatThreatInfoNotify getDefaultInstanceForType() {
                return EvtAiSyncCombatThreatInfoNotify.getDefaultInstance();
            }
            
            @Override
            public EvtAiSyncCombatThreatInfoNotify build() {
                final EvtAiSyncCombatThreatInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EvtAiSyncCombatThreatInfoNotify buildPartial() {
                final EvtAiSyncCombatThreatInfoNotify result = new EvtAiSyncCombatThreatInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.combatThreatInfoMap_ = this.internalGetCombatThreatInfoMap()).makeImmutable();
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof EvtAiSyncCombatThreatInfoNotify) {
                    return this.mergeFrom((EvtAiSyncCombatThreatInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EvtAiSyncCombatThreatInfoNotify other) {
                if (other == EvtAiSyncCombatThreatInfoNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableCombatThreatInfoMap().mergeFrom(other.internalGetCombatThreatInfoMap());
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                EvtAiSyncCombatThreatInfoNotify parsedMessage = null;
                try {
                    parsedMessage = EvtAiSyncCombatThreatInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EvtAiSyncCombatThreatInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, AiThreatInfoOuterClass.AiThreatInfo> internalGetCombatThreatInfoMap() {
                if (this.combatThreatInfoMap_ == null) {
                    return MapField.emptyMapField(CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
                }
                return this.combatThreatInfoMap_;
            }
            
            private MapField<Integer, AiThreatInfoOuterClass.AiThreatInfo> internalGetMutableCombatThreatInfoMap() {
                this.onChanged();
                if (this.combatThreatInfoMap_ == null) {
                    this.combatThreatInfoMap_ = MapField.newMapField(CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.combatThreatInfoMap_.isMutable()) {
                    this.combatThreatInfoMap_ = this.combatThreatInfoMap_.copy();
                }
                return this.combatThreatInfoMap_;
            }
            
            @Override
            public int getCombatThreatInfoMapCount() {
                return this.internalGetCombatThreatInfoMap().getMap().size();
            }
            
            @Override
            public boolean containsCombatThreatInfoMap(final int key) {
                return this.internalGetCombatThreatInfoMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getCombatThreatInfoMap() {
                return this.getCombatThreatInfoMapMap();
            }
            
            @Override
            public Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getCombatThreatInfoMapMap() {
                return this.internalGetCombatThreatInfoMap().getMap();
            }
            
            @Override
            public AiThreatInfoOuterClass.AiThreatInfo getCombatThreatInfoMapOrDefault(final int key, final AiThreatInfoOuterClass.AiThreatInfo defaultValue) {
                final Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> map = this.internalGetCombatThreatInfoMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AiThreatInfoOuterClass.AiThreatInfo getCombatThreatInfoMapOrThrow(final int key) {
                final Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> map = this.internalGetCombatThreatInfoMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearCombatThreatInfoMap() {
                this.internalGetMutableCombatThreatInfoMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeCombatThreatInfoMap(final int key) {
                this.internalGetMutableCombatThreatInfoMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getMutableCombatThreatInfoMap() {
                return this.internalGetMutableCombatThreatInfoMap().getMutableMap();
            }
            
            public Builder putCombatThreatInfoMap(final int key, final AiThreatInfoOuterClass.AiThreatInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableCombatThreatInfoMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllCombatThreatInfoMap(final Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> values) {
                this.internalGetMutableCombatThreatInfoMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EvtAiSyncCombatThreatInfoNotifyOrBuilder extends MessageOrBuilder
    {
        int getCombatThreatInfoMapCount();
        
        boolean containsCombatThreatInfoMap(final int p0);
        
        @Deprecated
        Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getCombatThreatInfoMap();
        
        Map<Integer, AiThreatInfoOuterClass.AiThreatInfo> getCombatThreatInfoMapMap();
        
        AiThreatInfoOuterClass.AiThreatInfo getCombatThreatInfoMapOrDefault(final int p0, final AiThreatInfoOuterClass.AiThreatInfo p1);
        
        AiThreatInfoOuterClass.AiThreatInfo getCombatThreatInfoMapOrThrow(final int p0);
    }
}
