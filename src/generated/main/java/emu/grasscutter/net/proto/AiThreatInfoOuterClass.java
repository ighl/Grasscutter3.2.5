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

public final class AiThreatInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AiThreatInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AiThreatInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AiThreatInfo_AiThreatMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AiThreatInfo_AiThreatMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AiThreatInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AiThreatInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012AiThreatInfo.proto\"y\n\fAiThreatInfo\u00125\n\rai_threat_map\u0018\u0003 \u0003(\u000b2\u001e.AiThreatInfo.AiThreatMapEntry\u001a2\n\u0010AiThreatMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AiThreatInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AiThreatInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AiThreatInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor, new String[] { "AiThreatMap" });
        internal_static_AiThreatInfo_AiThreatMapEntry_descriptor = AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor.getNestedTypes().get(0);
        internal_static_AiThreatInfo_AiThreatMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AiThreatInfoOuterClass.internal_static_AiThreatInfo_AiThreatMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class AiThreatInfo extends GeneratedMessageV3 implements AiThreatInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AI_THREAT_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, Integer> aiThreatMap_;
        private byte memoizedIsInitialized;
        private static final AiThreatInfo DEFAULT_INSTANCE;
        private static final Parser<AiThreatInfo> PARSER;
        
        private AiThreatInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AiThreatInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AiThreatInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AiThreatInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.aiThreatMap_ = MapField.newMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> aiThreatMap__ = input.readMessage(AiThreatMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.aiThreatMap_.getMutableMap().put(aiThreatMap__.getKey(), aiThreatMap__.getValue());
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
            return AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetAiThreatMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AiThreatInfoOuterClass.internal_static_AiThreatInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AiThreatInfo.class, Builder.class);
        }
        
        private MapField<Integer, Integer> internalGetAiThreatMap() {
            if (this.aiThreatMap_ == null) {
                return MapField.emptyMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
            }
            return this.aiThreatMap_;
        }
        
        @Override
        public int getAiThreatMapCount() {
            return this.internalGetAiThreatMap().getMap().size();
        }
        
        @Override
        public boolean containsAiThreatMap(final int key) {
            return this.internalGetAiThreatMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getAiThreatMap() {
            return this.getAiThreatMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getAiThreatMapMap() {
            return this.internalGetAiThreatMap().getMap();
        }
        
        @Override
        public int getAiThreatMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getAiThreatMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetAiThreatMap(), AiThreatMapDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetAiThreatMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> aiThreatMap__ = AiThreatMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, aiThreatMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AiThreatInfo)) {
                return super.equals(obj);
            }
            final AiThreatInfo other = (AiThreatInfo)obj;
            return this.internalGetAiThreatMap().equals(other.internalGetAiThreatMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetAiThreatMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetAiThreatMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AiThreatInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AiThreatInfo.PARSER.parseFrom(data);
        }
        
        public static AiThreatInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AiThreatInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AiThreatInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AiThreatInfo.PARSER.parseFrom(data);
        }
        
        public static AiThreatInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AiThreatInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AiThreatInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AiThreatInfo.PARSER.parseFrom(data);
        }
        
        public static AiThreatInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AiThreatInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AiThreatInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiThreatInfo.PARSER, input);
        }
        
        public static AiThreatInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiThreatInfo.PARSER, input, extensionRegistry);
        }
        
        public static AiThreatInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AiThreatInfo.PARSER, input);
        }
        
        public static AiThreatInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AiThreatInfo.PARSER, input, extensionRegistry);
        }
        
        public static AiThreatInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiThreatInfo.PARSER, input);
        }
        
        public static AiThreatInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiThreatInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AiThreatInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AiThreatInfo prototype) {
            return AiThreatInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AiThreatInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AiThreatInfo getDefaultInstance() {
            return AiThreatInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AiThreatInfo> parser() {
            return AiThreatInfo.PARSER;
        }
        
        @Override
        public Parser<AiThreatInfo> getParserForType() {
            return AiThreatInfo.PARSER;
        }
        
        @Override
        public AiThreatInfo getDefaultInstanceForType() {
            return AiThreatInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AiThreatInfo();
            PARSER = new AbstractParser<AiThreatInfo>() {
                @Override
                public AiThreatInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AiThreatInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class AiThreatMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AiThreatInfoOuterClass.internal_static_AiThreatInfo_AiThreatMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AiThreatInfoOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, Integer> aiThreatMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetAiThreatMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetMutableAiThreatMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AiThreatInfoOuterClass.internal_static_AiThreatInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AiThreatInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AiThreatInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableAiThreatMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor;
            }
            
            @Override
            public AiThreatInfo getDefaultInstanceForType() {
                return AiThreatInfo.getDefaultInstance();
            }
            
            @Override
            public AiThreatInfo build() {
                final AiThreatInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AiThreatInfo buildPartial() {
                final AiThreatInfo result = new AiThreatInfo(this);
                final int from_bitField0_ = this.bitField0_;
                (result.aiThreatMap_ = this.internalGetAiThreatMap()).makeImmutable();
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
                if (other instanceof AiThreatInfo) {
                    return this.mergeFrom((AiThreatInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AiThreatInfo other) {
                if (other == AiThreatInfo.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableAiThreatMap().mergeFrom(other.internalGetAiThreatMap());
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
                AiThreatInfo parsedMessage = null;
                try {
                    parsedMessage = AiThreatInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AiThreatInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, Integer> internalGetAiThreatMap() {
                if (this.aiThreatMap_ == null) {
                    return MapField.emptyMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
                }
                return this.aiThreatMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableAiThreatMap() {
                this.onChanged();
                if (this.aiThreatMap_ == null) {
                    this.aiThreatMap_ = MapField.newMapField(AiThreatMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.aiThreatMap_.isMutable()) {
                    this.aiThreatMap_ = this.aiThreatMap_.copy();
                }
                return this.aiThreatMap_;
            }
            
            @Override
            public int getAiThreatMapCount() {
                return this.internalGetAiThreatMap().getMap().size();
            }
            
            @Override
            public boolean containsAiThreatMap(final int key) {
                return this.internalGetAiThreatMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getAiThreatMap() {
                return this.getAiThreatMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getAiThreatMapMap() {
                return this.internalGetAiThreatMap().getMap();
            }
            
            @Override
            public int getAiThreatMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getAiThreatMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetAiThreatMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearAiThreatMap() {
                this.internalGetMutableAiThreatMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeAiThreatMap(final int key) {
                this.internalGetMutableAiThreatMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableAiThreatMap() {
                return this.internalGetMutableAiThreatMap().getMutableMap();
            }
            
            public Builder putAiThreatMap(final int key, final int value) {
                this.internalGetMutableAiThreatMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllAiThreatMap(final Map<Integer, Integer> values) {
                this.internalGetMutableAiThreatMap().getMutableMap().putAll(values);
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
    
    public interface AiThreatInfoOrBuilder extends MessageOrBuilder
    {
        int getAiThreatMapCount();
        
        boolean containsAiThreatMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getAiThreatMap();
        
        Map<Integer, Integer> getAiThreatMapMap();
        
        int getAiThreatMapOrDefault(final int p0, final int p1);
        
        int getAiThreatMapOrThrow(final int p0);
    }
}
