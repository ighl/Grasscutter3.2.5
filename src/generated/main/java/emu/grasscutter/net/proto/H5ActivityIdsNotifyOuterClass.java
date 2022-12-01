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

public final class H5ActivityIdsNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_H5ActivityIdsNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_H5ActivityIdsNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private H5ActivityIdsNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return H5ActivityIdsNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019H5ActivityIdsNotify.proto\"¯\u0001\n\u0013H5ActivityIdsNotify\u0012 \n\u0018client_red_dot_timestamp\u0018\u0001 \u0001(\r\u0012@\n\u000fh5_activity_map\u0018\f \u0003(\u000b2'.H5ActivityIdsNotify.H5ActivityMapEntry\u001a4\n\u0012H5ActivityMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        H5ActivityIdsNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_H5ActivityIdsNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_H5ActivityIdsNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor, new String[] { "ClientRedDotTimestamp", "H5ActivityMap" });
        internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor = H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor.getNestedTypes().get(0);
        internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class H5ActivityIdsNotify extends GeneratedMessageV3 implements H5ActivityIdsNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CLIENT_RED_DOT_TIMESTAMP_FIELD_NUMBER = 1;
        private int clientRedDotTimestamp_;
        public static final int H5_ACTIVITY_MAP_FIELD_NUMBER = 12;
        private MapField<Integer, Integer> h5ActivityMap_;
        private byte memoizedIsInitialized;
        private static final H5ActivityIdsNotify DEFAULT_INSTANCE;
        private static final Parser<H5ActivityIdsNotify> PARSER;
        
        private H5ActivityIdsNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private H5ActivityIdsNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new H5ActivityIdsNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private H5ActivityIdsNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.clientRedDotTimestamp_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.h5ActivityMap_ = MapField.newMapField(H5ActivityMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> h5ActivityMap__ = input.readMessage(H5ActivityMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.h5ActivityMap_.getMutableMap().put(h5ActivityMap__.getKey(), h5ActivityMap__.getValue());
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
            return H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 12: {
                    return this.internalGetH5ActivityMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(H5ActivityIdsNotify.class, Builder.class);
        }
        
        @Override
        public int getClientRedDotTimestamp() {
            return this.clientRedDotTimestamp_;
        }
        
        private MapField<Integer, Integer> internalGetH5ActivityMap() {
            if (this.h5ActivityMap_ == null) {
                return MapField.emptyMapField(H5ActivityMapDefaultEntryHolder.defaultEntry);
            }
            return this.h5ActivityMap_;
        }
        
        @Override
        public int getH5ActivityMapCount() {
            return this.internalGetH5ActivityMap().getMap().size();
        }
        
        @Override
        public boolean containsH5ActivityMap(final int key) {
            return this.internalGetH5ActivityMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getH5ActivityMap() {
            return this.getH5ActivityMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getH5ActivityMapMap() {
            return this.internalGetH5ActivityMap().getMap();
        }
        
        @Override
        public int getH5ActivityMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetH5ActivityMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getH5ActivityMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetH5ActivityMap().getMap();
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
            if (this.clientRedDotTimestamp_ != 0) {
                output.writeUInt32(1, this.clientRedDotTimestamp_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetH5ActivityMap(), H5ActivityMapDefaultEntryHolder.defaultEntry, 12);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.clientRedDotTimestamp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.clientRedDotTimestamp_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetH5ActivityMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> h5ActivityMap__ = H5ActivityMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(12, h5ActivityMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof H5ActivityIdsNotify)) {
                return super.equals(obj);
            }
            final H5ActivityIdsNotify other = (H5ActivityIdsNotify)obj;
            return this.getClientRedDotTimestamp() == other.getClientRedDotTimestamp() && this.internalGetH5ActivityMap().equals(other.internalGetH5ActivityMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getClientRedDotTimestamp();
            if (!this.internalGetH5ActivityMap().getMap().isEmpty()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.internalGetH5ActivityMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static H5ActivityIdsNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return H5ActivityIdsNotify.PARSER.parseFrom(data);
        }
        
        public static H5ActivityIdsNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return H5ActivityIdsNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static H5ActivityIdsNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return H5ActivityIdsNotify.PARSER.parseFrom(data);
        }
        
        public static H5ActivityIdsNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return H5ActivityIdsNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static H5ActivityIdsNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return H5ActivityIdsNotify.PARSER.parseFrom(data);
        }
        
        public static H5ActivityIdsNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return H5ActivityIdsNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static H5ActivityIdsNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(H5ActivityIdsNotify.PARSER, input);
        }
        
        public static H5ActivityIdsNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(H5ActivityIdsNotify.PARSER, input, extensionRegistry);
        }
        
        public static H5ActivityIdsNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(H5ActivityIdsNotify.PARSER, input);
        }
        
        public static H5ActivityIdsNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(H5ActivityIdsNotify.PARSER, input, extensionRegistry);
        }
        
        public static H5ActivityIdsNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(H5ActivityIdsNotify.PARSER, input);
        }
        
        public static H5ActivityIdsNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(H5ActivityIdsNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return H5ActivityIdsNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final H5ActivityIdsNotify prototype) {
            return H5ActivityIdsNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == H5ActivityIdsNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static H5ActivityIdsNotify getDefaultInstance() {
            return H5ActivityIdsNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<H5ActivityIdsNotify> parser() {
            return H5ActivityIdsNotify.PARSER;
        }
        
        @Override
        public Parser<H5ActivityIdsNotify> getParserForType() {
            return H5ActivityIdsNotify.PARSER;
        }
        
        @Override
        public H5ActivityIdsNotify getDefaultInstanceForType() {
            return H5ActivityIdsNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new H5ActivityIdsNotify();
            PARSER = new AbstractParser<H5ActivityIdsNotify>() {
                @Override
                public H5ActivityIdsNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new H5ActivityIdsNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class H5ActivityMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements H5ActivityIdsNotifyOrBuilder
        {
            private int bitField0_;
            private int clientRedDotTimestamp_;
            private MapField<Integer, Integer> h5ActivityMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 12: {
                        return this.internalGetH5ActivityMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 12: {
                        return this.internalGetMutableH5ActivityMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(H5ActivityIdsNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (H5ActivityIdsNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.clientRedDotTimestamp_ = 0;
                this.internalGetMutableH5ActivityMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor;
            }
            
            @Override
            public H5ActivityIdsNotify getDefaultInstanceForType() {
                return H5ActivityIdsNotify.getDefaultInstance();
            }
            
            @Override
            public H5ActivityIdsNotify build() {
                final H5ActivityIdsNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public H5ActivityIdsNotify buildPartial() {
                final H5ActivityIdsNotify result = new H5ActivityIdsNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.clientRedDotTimestamp_ = this.clientRedDotTimestamp_;
                (result.h5ActivityMap_ = this.internalGetH5ActivityMap()).makeImmutable();
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
                if (other instanceof H5ActivityIdsNotify) {
                    return this.mergeFrom((H5ActivityIdsNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final H5ActivityIdsNotify other) {
                if (other == H5ActivityIdsNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getClientRedDotTimestamp() != 0) {
                    this.setClientRedDotTimestamp(other.getClientRedDotTimestamp());
                }
                this.internalGetMutableH5ActivityMap().mergeFrom(other.internalGetH5ActivityMap());
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
                H5ActivityIdsNotify parsedMessage = null;
                try {
                    parsedMessage = H5ActivityIdsNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (H5ActivityIdsNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getClientRedDotTimestamp() {
                return this.clientRedDotTimestamp_;
            }
            
            public Builder setClientRedDotTimestamp(final int value) {
                this.clientRedDotTimestamp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientRedDotTimestamp() {
                this.clientRedDotTimestamp_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetH5ActivityMap() {
                if (this.h5ActivityMap_ == null) {
                    return MapField.emptyMapField(H5ActivityMapDefaultEntryHolder.defaultEntry);
                }
                return this.h5ActivityMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableH5ActivityMap() {
                this.onChanged();
                if (this.h5ActivityMap_ == null) {
                    this.h5ActivityMap_ = MapField.newMapField(H5ActivityMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.h5ActivityMap_.isMutable()) {
                    this.h5ActivityMap_ = this.h5ActivityMap_.copy();
                }
                return this.h5ActivityMap_;
            }
            
            @Override
            public int getH5ActivityMapCount() {
                return this.internalGetH5ActivityMap().getMap().size();
            }
            
            @Override
            public boolean containsH5ActivityMap(final int key) {
                return this.internalGetH5ActivityMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getH5ActivityMap() {
                return this.getH5ActivityMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getH5ActivityMapMap() {
                return this.internalGetH5ActivityMap().getMap();
            }
            
            @Override
            public int getH5ActivityMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetH5ActivityMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getH5ActivityMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetH5ActivityMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearH5ActivityMap() {
                this.internalGetMutableH5ActivityMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeH5ActivityMap(final int key) {
                this.internalGetMutableH5ActivityMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableH5ActivityMap() {
                return this.internalGetMutableH5ActivityMap().getMutableMap();
            }
            
            public Builder putH5ActivityMap(final int key, final int value) {
                this.internalGetMutableH5ActivityMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllH5ActivityMap(final Map<Integer, Integer> values) {
                this.internalGetMutableH5ActivityMap().getMutableMap().putAll(values);
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
    
    public interface H5ActivityIdsNotifyOrBuilder extends MessageOrBuilder
    {
        int getClientRedDotTimestamp();
        
        int getH5ActivityMapCount();
        
        boolean containsH5ActivityMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getH5ActivityMap();
        
        Map<Integer, Integer> getH5ActivityMapMap();
        
        int getH5ActivityMapOrDefault(final int p0, final int p1);
        
        int getH5ActivityMapOrThrow(final int p0);
    }
}
