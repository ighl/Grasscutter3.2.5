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
import com.google.protobuf.Internal;
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

public final class EntityRendererChangedInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityRendererChangedInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityRendererChangedInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityRendererChangedInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityRendererChangedInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fEntityRendererChangedInfo.proto\"\u00ce\u0001\n\u0019EntityRendererChangedInfo\u0012K\n\u0011changed_renderers\u0018\u0001 \u0003(\u000b20.EntityRendererChangedInfo.ChangedRenderersEntry\u0012\u0018\n\u0010visibility_count\u0018\u0002 \u0001(\r\u0012\u0011\n\tis_cached\u0018\u0003 \u0001(\b\u001a7\n\u0015ChangedRenderersEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityRendererChangedInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EntityRendererChangedInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityRendererChangedInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor, new String[] { "ChangedRenderers", "VisibilityCount", "IsCached" });
        internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor = EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor.getNestedTypes().get(0);
        internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class EntityRendererChangedInfo extends GeneratedMessageV3 implements EntityRendererChangedInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHANGED_RENDERERS_FIELD_NUMBER = 1;
        private MapField<String, Integer> changedRenderers_;
        public static final int VISIBILITY_COUNT_FIELD_NUMBER = 2;
        private int visibilityCount_;
        public static final int IS_CACHED_FIELD_NUMBER = 3;
        private boolean isCached_;
        private byte memoizedIsInitialized;
        private static final EntityRendererChangedInfo DEFAULT_INSTANCE;
        private static final Parser<EntityRendererChangedInfo> PARSER;
        
        private EntityRendererChangedInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityRendererChangedInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityRendererChangedInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityRendererChangedInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.changedRenderers_ = MapField.newMapField(ChangedRenderersDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<String, Integer> changedRenderers__ = input.readMessage(ChangedRenderersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.changedRenderers_.getMutableMap().put(changedRenderers__.getKey(), changedRenderers__.getValue());
                            continue;
                        }
                        case 16: {
                            this.visibilityCount_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.isCached_ = input.readBool();
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
            return EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 1: {
                    return this.internalGetChangedRenderers();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityRendererChangedInfo.class, Builder.class);
        }
        
        private MapField<String, Integer> internalGetChangedRenderers() {
            if (this.changedRenderers_ == null) {
                return MapField.emptyMapField(ChangedRenderersDefaultEntryHolder.defaultEntry);
            }
            return this.changedRenderers_;
        }
        
        @Override
        public int getChangedRenderersCount() {
            return this.internalGetChangedRenderers().getMap().size();
        }
        
        @Override
        public boolean containsChangedRenderers(final String key) {
            if (key == null) {
                throw new NullPointerException();
            }
            return this.internalGetChangedRenderers().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<String, Integer> getChangedRenderers() {
            return this.getChangedRenderersMap();
        }
        
        @Override
        public Map<String, Integer> getChangedRenderersMap() {
            return this.internalGetChangedRenderers().getMap();
        }
        
        @Override
        public int getChangedRenderersOrDefault(final String key, final int defaultValue) {
            if (key == null) {
                throw new NullPointerException();
            }
            final Map<String, Integer> map = this.internalGetChangedRenderers().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getChangedRenderersOrThrow(final String key) {
            if (key == null) {
                throw new NullPointerException();
            }
            final Map<String, Integer> map = this.internalGetChangedRenderers().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getVisibilityCount() {
            return this.visibilityCount_;
        }
        
        @Override
        public boolean getIsCached() {
            return this.isCached_;
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
            GeneratedMessageV3.serializeStringMapTo(output, this.internalGetChangedRenderers(), ChangedRenderersDefaultEntryHolder.defaultEntry, 1);
            if (this.visibilityCount_ != 0) {
                output.writeUInt32(2, this.visibilityCount_);
            }
            if (this.isCached_) {
                output.writeBool(3, this.isCached_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<String, Integer> entry : this.internalGetChangedRenderers().getMap().entrySet()) {
                final MapEntry<String, Integer> changedRenderers__ = ChangedRenderersDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(1, changedRenderers__);
            }
            if (this.visibilityCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.visibilityCount_);
            }
            if (this.isCached_) {
                size += CodedOutputStream.computeBoolSize(3, this.isCached_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityRendererChangedInfo)) {
                return super.equals(obj);
            }
            final EntityRendererChangedInfo other = (EntityRendererChangedInfo)obj;
            return this.internalGetChangedRenderers().equals(other.internalGetChangedRenderers()) && this.getVisibilityCount() == other.getVisibilityCount() && this.getIsCached() == other.getIsCached() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetChangedRenderers().getMap().isEmpty()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.internalGetChangedRenderers().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getVisibilityCount();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsCached());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityRendererChangedInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityRendererChangedInfo.PARSER.parseFrom(data);
        }
        
        public static EntityRendererChangedInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityRendererChangedInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityRendererChangedInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityRendererChangedInfo.PARSER.parseFrom(data);
        }
        
        public static EntityRendererChangedInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityRendererChangedInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityRendererChangedInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityRendererChangedInfo.PARSER.parseFrom(data);
        }
        
        public static EntityRendererChangedInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityRendererChangedInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityRendererChangedInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityRendererChangedInfo.PARSER, input);
        }
        
        public static EntityRendererChangedInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityRendererChangedInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityRendererChangedInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityRendererChangedInfo.PARSER, input);
        }
        
        public static EntityRendererChangedInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityRendererChangedInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityRendererChangedInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityRendererChangedInfo.PARSER, input);
        }
        
        public static EntityRendererChangedInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityRendererChangedInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityRendererChangedInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityRendererChangedInfo prototype) {
            return EntityRendererChangedInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityRendererChangedInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityRendererChangedInfo getDefaultInstance() {
            return EntityRendererChangedInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityRendererChangedInfo> parser() {
            return EntityRendererChangedInfo.PARSER;
        }
        
        @Override
        public Parser<EntityRendererChangedInfo> getParserForType() {
            return EntityRendererChangedInfo.PARSER;
        }
        
        @Override
        public EntityRendererChangedInfo getDefaultInstanceForType() {
            return EntityRendererChangedInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityRendererChangedInfo();
            PARSER = new AbstractParser<EntityRendererChangedInfo>() {
                @Override
                public EntityRendererChangedInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityRendererChangedInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class ChangedRenderersDefaultEntryHolder
        {
            static final MapEntry<String, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityRendererChangedInfoOrBuilder
        {
            private int bitField0_;
            private MapField<String, Integer> changedRenderers_;
            private int visibilityCount_;
            private boolean isCached_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 1: {
                        return this.internalGetChangedRenderers();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 1: {
                        return this.internalGetMutableChangedRenderers();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityRendererChangedInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityRendererChangedInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableChangedRenderers().clear();
                this.visibilityCount_ = 0;
                this.isCached_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor;
            }
            
            @Override
            public EntityRendererChangedInfo getDefaultInstanceForType() {
                return EntityRendererChangedInfo.getDefaultInstance();
            }
            
            @Override
            public EntityRendererChangedInfo build() {
                final EntityRendererChangedInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityRendererChangedInfo buildPartial() {
                final EntityRendererChangedInfo result = new EntityRendererChangedInfo(this);
                final int from_bitField0_ = this.bitField0_;
                (result.changedRenderers_ = this.internalGetChangedRenderers()).makeImmutable();
                result.visibilityCount_ = this.visibilityCount_;
                result.isCached_ = this.isCached_;
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
                if (other instanceof EntityRendererChangedInfo) {
                    return this.mergeFrom((EntityRendererChangedInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityRendererChangedInfo other) {
                if (other == EntityRendererChangedInfo.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableChangedRenderers().mergeFrom(other.internalGetChangedRenderers());
                if (other.getVisibilityCount() != 0) {
                    this.setVisibilityCount(other.getVisibilityCount());
                }
                if (other.getIsCached()) {
                    this.setIsCached(other.getIsCached());
                }
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
                EntityRendererChangedInfo parsedMessage = null;
                try {
                    parsedMessage = EntityRendererChangedInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityRendererChangedInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<String, Integer> internalGetChangedRenderers() {
                if (this.changedRenderers_ == null) {
                    return MapField.emptyMapField(ChangedRenderersDefaultEntryHolder.defaultEntry);
                }
                return this.changedRenderers_;
            }
            
            private MapField<String, Integer> internalGetMutableChangedRenderers() {
                this.onChanged();
                if (this.changedRenderers_ == null) {
                    this.changedRenderers_ = MapField.newMapField(ChangedRenderersDefaultEntryHolder.defaultEntry);
                }
                if (!this.changedRenderers_.isMutable()) {
                    this.changedRenderers_ = this.changedRenderers_.copy();
                }
                return this.changedRenderers_;
            }
            
            @Override
            public int getChangedRenderersCount() {
                return this.internalGetChangedRenderers().getMap().size();
            }
            
            @Override
            public boolean containsChangedRenderers(final String key) {
                if (key == null) {
                    throw new NullPointerException();
                }
                return this.internalGetChangedRenderers().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<String, Integer> getChangedRenderers() {
                return this.getChangedRenderersMap();
            }
            
            @Override
            public Map<String, Integer> getChangedRenderersMap() {
                return this.internalGetChangedRenderers().getMap();
            }
            
            @Override
            public int getChangedRenderersOrDefault(final String key, final int defaultValue) {
                if (key == null) {
                    throw new NullPointerException();
                }
                final Map<String, Integer> map = this.internalGetChangedRenderers().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getChangedRenderersOrThrow(final String key) {
                if (key == null) {
                    throw new NullPointerException();
                }
                final Map<String, Integer> map = this.internalGetChangedRenderers().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearChangedRenderers() {
                this.internalGetMutableChangedRenderers().getMutableMap().clear();
                return this;
            }
            
            public Builder removeChangedRenderers(final String key) {
                if (key == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableChangedRenderers().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<String, Integer> getMutableChangedRenderers() {
                return this.internalGetMutableChangedRenderers().getMutableMap();
            }
            
            public Builder putChangedRenderers(final String key, final int value) {
                if (key == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableChangedRenderers().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllChangedRenderers(final Map<String, Integer> values) {
                this.internalGetMutableChangedRenderers().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getVisibilityCount() {
                return this.visibilityCount_;
            }
            
            public Builder setVisibilityCount(final int value) {
                this.visibilityCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearVisibilityCount() {
                this.visibilityCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsCached() {
                return this.isCached_;
            }
            
            public Builder setIsCached(final boolean value) {
                this.isCached_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsCached() {
                this.isCached_ = false;
                this.onChanged();
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
    
    public interface EntityRendererChangedInfoOrBuilder extends MessageOrBuilder
    {
        int getChangedRenderersCount();
        
        boolean containsChangedRenderers(final String p0);
        
        @Deprecated
        Map<String, Integer> getChangedRenderers();
        
        Map<String, Integer> getChangedRenderersMap();
        
        int getChangedRenderersOrDefault(final String p0, final int p1);
        
        int getChangedRenderersOrThrow(final String p0);
        
        int getVisibilityCount();
        
        boolean getIsCached();
    }
}
