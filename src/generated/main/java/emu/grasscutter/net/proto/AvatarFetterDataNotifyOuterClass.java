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

public final class AvatarFetterDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarFetterDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarFetterDataNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarFetterDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarFetterDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cAvatarFetterDataNotify.proto\u001a\u0016AvatarFetterInfo.proto\"¦\u0001\n\u0016AvatarFetterDataNotify\u0012C\n\u000ffetter_info_map\u0018\u000f \u0003(\u000b2*.AvatarFetterDataNotify.FetterInfoMapEntry\u001aG\n\u0012FetterInfoMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0004\u0012 \n\u0005value\u0018\u0002 \u0001(\u000b2\u0011.AvatarFetterInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarFetterDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarFetterInfoOuterClass.getDescriptor() });
        internal_static_AvatarFetterDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarFetterDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor, new String[] { "FetterInfoMap" });
        internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor = AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor.getNestedTypes().get(0);
        internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarFetterInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarFetterDataNotify extends GeneratedMessageV3 implements AvatarFetterDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FETTER_INFO_MAP_FIELD_NUMBER = 15;
        private MapField<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> fetterInfoMap_;
        private byte memoizedIsInitialized;
        private static final AvatarFetterDataNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarFetterDataNotify> PARSER;
        
        private AvatarFetterDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarFetterDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarFetterDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarFetterDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.fetterInfoMap_ = MapField.newMapField(FetterInfoMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> fetterInfoMap__ = input.readMessage(FetterInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.fetterInfoMap_.getMutableMap().put(fetterInfoMap__.getKey(), fetterInfoMap__.getValue());
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
            return AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 15: {
                    return this.internalGetFetterInfoMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterDataNotify.class, Builder.class);
        }
        
        private MapField<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> internalGetFetterInfoMap() {
            if (this.fetterInfoMap_ == null) {
                return MapField.emptyMapField(FetterInfoMapDefaultEntryHolder.defaultEntry);
            }
            return this.fetterInfoMap_;
        }
        
        @Override
        public int getFetterInfoMapCount() {
            return this.internalGetFetterInfoMap().getMap().size();
        }
        
        @Override
        public boolean containsFetterInfoMap(final long key) {
            return this.internalGetFetterInfoMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMap() {
            return this.getFetterInfoMapMap();
        }
        
        @Override
        public Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMapMap() {
            return this.internalGetFetterInfoMap().getMap();
        }
        
        @Override
        public AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrDefault(final long key, final AvatarFetterInfoOuterClass.AvatarFetterInfo defaultValue) {
            final Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> map = this.internalGetFetterInfoMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrThrow(final long key) {
            final Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> map = this.internalGetFetterInfoMap().getMap();
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
            GeneratedMessageV3.serializeLongMapTo(output, this.internalGetFetterInfoMap(), FetterInfoMapDefaultEntryHolder.defaultEntry, 15);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> entry : this.internalGetFetterInfoMap().getMap().entrySet()) {
                final MapEntry<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> fetterInfoMap__ = FetterInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(15, fetterInfoMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarFetterDataNotify)) {
                return super.equals(obj);
            }
            final AvatarFetterDataNotify other = (AvatarFetterDataNotify)obj;
            return this.internalGetFetterInfoMap().equals(other.internalGetFetterInfoMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetFetterInfoMap().getMap().isEmpty()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.internalGetFetterInfoMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarFetterDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarFetterDataNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarFetterDataNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarFetterDataNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterDataNotify.PARSER, input);
        }
        
        public static AvatarFetterDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterDataNotify.PARSER, input);
        }
        
        public static AvatarFetterDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterDataNotify.PARSER, input);
        }
        
        public static AvatarFetterDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarFetterDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarFetterDataNotify prototype) {
            return AvatarFetterDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarFetterDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarFetterDataNotify getDefaultInstance() {
            return AvatarFetterDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarFetterDataNotify> parser() {
            return AvatarFetterDataNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarFetterDataNotify> getParserForType() {
            return AvatarFetterDataNotify.PARSER;
        }
        
        @Override
        public AvatarFetterDataNotify getDefaultInstanceForType() {
            return AvatarFetterDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarFetterDataNotify();
            PARSER = new AbstractParser<AvatarFetterDataNotify>() {
                @Override
                public AvatarFetterDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarFetterDataNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class FetterInfoMapDefaultEntryHolder
        {
            static final MapEntry<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor, WireFormat.FieldType.UINT64, 0L, WireFormat.FieldType.MESSAGE, AvatarFetterInfoOuterClass.AvatarFetterInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarFetterDataNotifyOrBuilder
        {
            private int bitField0_;
            private MapField<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> fetterInfoMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 15: {
                        return this.internalGetFetterInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 15: {
                        return this.internalGetMutableFetterInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarFetterDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableFetterInfoMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor;
            }
            
            @Override
            public AvatarFetterDataNotify getDefaultInstanceForType() {
                return AvatarFetterDataNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarFetterDataNotify build() {
                final AvatarFetterDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarFetterDataNotify buildPartial() {
                final AvatarFetterDataNotify result = new AvatarFetterDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.fetterInfoMap_ = this.internalGetFetterInfoMap()).makeImmutable();
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
                if (other instanceof AvatarFetterDataNotify) {
                    return this.mergeFrom((AvatarFetterDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarFetterDataNotify other) {
                if (other == AvatarFetterDataNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableFetterInfoMap().mergeFrom(other.internalGetFetterInfoMap());
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
                AvatarFetterDataNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarFetterDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarFetterDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> internalGetFetterInfoMap() {
                if (this.fetterInfoMap_ == null) {
                    return MapField.emptyMapField(FetterInfoMapDefaultEntryHolder.defaultEntry);
                }
                return this.fetterInfoMap_;
            }
            
            private MapField<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> internalGetMutableFetterInfoMap() {
                this.onChanged();
                if (this.fetterInfoMap_ == null) {
                    this.fetterInfoMap_ = MapField.newMapField(FetterInfoMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.fetterInfoMap_.isMutable()) {
                    this.fetterInfoMap_ = this.fetterInfoMap_.copy();
                }
                return this.fetterInfoMap_;
            }
            
            @Override
            public int getFetterInfoMapCount() {
                return this.internalGetFetterInfoMap().getMap().size();
            }
            
            @Override
            public boolean containsFetterInfoMap(final long key) {
                return this.internalGetFetterInfoMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMap() {
                return this.getFetterInfoMapMap();
            }
            
            @Override
            public Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMapMap() {
                return this.internalGetFetterInfoMap().getMap();
            }
            
            @Override
            public AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrDefault(final long key, final AvatarFetterInfoOuterClass.AvatarFetterInfo defaultValue) {
                final Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> map = this.internalGetFetterInfoMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrThrow(final long key) {
                final Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> map = this.internalGetFetterInfoMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearFetterInfoMap() {
                this.internalGetMutableFetterInfoMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeFetterInfoMap(final long key) {
                this.internalGetMutableFetterInfoMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getMutableFetterInfoMap() {
                return this.internalGetMutableFetterInfoMap().getMutableMap();
            }
            
            public Builder putFetterInfoMap(final long key, final AvatarFetterInfoOuterClass.AvatarFetterInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableFetterInfoMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllFetterInfoMap(final Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> values) {
                this.internalGetMutableFetterInfoMap().getMutableMap().putAll(values);
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
    
    public interface AvatarFetterDataNotifyOrBuilder extends MessageOrBuilder
    {
        int getFetterInfoMapCount();
        
        boolean containsFetterInfoMap(final long p0);
        
        @Deprecated
        Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMap();
        
        Map<Long, AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMapMap();
        
        AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrDefault(final long p0, final AvatarFetterInfoOuterClass.AvatarFetterInfo p1);
        
        AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrThrow(final long p0);
    }
}
