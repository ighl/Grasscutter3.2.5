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

public final class EntityFightPropNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityFightPropNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityFightPropNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityFightPropNotify_FightPropMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityFightPropNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityFightPropNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bEntityFightPropNotify.proto\"¡\u0001\n\u0015EntityFightPropNotify\u0012\u0011\n\tentity_id\u0018\t \u0001(\r\u0012@\n\u000efight_prop_map\u0018\u0002 \u0003(\u000b2(.EntityFightPropNotify.FightPropMapEntry\u001a3\n\u0011FightPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0002:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityFightPropNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EntityFightPropNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityFightPropNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_descriptor, new String[] { "EntityId", "FightPropMap" });
        internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor = EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_descriptor.getNestedTypes().get(0);
        internal_static_EntityFightPropNotify_FightPropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class EntityFightPropNotify extends GeneratedMessageV3 implements EntityFightPropNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 9;
        private int entityId_;
        public static final int FIGHT_PROP_MAP_FIELD_NUMBER = 2;
        private MapField<Integer, Float> fightPropMap_;
        private byte memoizedIsInitialized;
        private static final EntityFightPropNotify DEFAULT_INSTANCE;
        private static final Parser<EntityFightPropNotify> PARSER;
        
        private EntityFightPropNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityFightPropNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityFightPropNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityFightPropNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.fightPropMap_ = MapField.newMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Float> fightPropMap__ = input.readMessage(FightPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.fightPropMap_.getMutableMap().put(fightPropMap__.getKey(), fightPropMap__.getValue());
                            continue;
                        }
                        case 72: {
                            this.entityId_ = input.readUInt32();
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
            return EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 2: {
                    return this.internalGetFightPropMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityFightPropNotify.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        private MapField<Integer, Float> internalGetFightPropMap() {
            if (this.fightPropMap_ == null) {
                return MapField.emptyMapField(FightPropMapDefaultEntryHolder.defaultEntry);
            }
            return this.fightPropMap_;
        }
        
        @Override
        public int getFightPropMapCount() {
            return this.internalGetFightPropMap().getMap().size();
        }
        
        @Override
        public boolean containsFightPropMap(final int key) {
            return this.internalGetFightPropMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Float> getFightPropMap() {
            return this.getFightPropMapMap();
        }
        
        @Override
        public Map<Integer, Float> getFightPropMapMap() {
            return this.internalGetFightPropMap().getMap();
        }
        
        @Override
        public float getFightPropMapOrDefault(final int key, final float defaultValue) {
            final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public float getFightPropMapOrThrow(final int key) {
            final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetFightPropMap(), FightPropMapDefaultEntryHolder.defaultEntry, 2);
            if (this.entityId_ != 0) {
                output.writeUInt32(9, this.entityId_);
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
            for (final Map.Entry<Integer, Float> entry : this.internalGetFightPropMap().getMap().entrySet()) {
                final MapEntry<Integer, Float> fightPropMap__ = FightPropMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(2, fightPropMap__);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityFightPropNotify)) {
                return super.equals(obj);
            }
            final EntityFightPropNotify other = (EntityFightPropNotify)obj;
            return this.getEntityId() == other.getEntityId() && this.internalGetFightPropMap().equals(other.internalGetFightPropMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getEntityId();
            if (!this.internalGetFightPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.internalGetFightPropMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityFightPropNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityFightPropNotify.PARSER.parseFrom(data);
        }
        
        public static EntityFightPropNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityFightPropNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityFightPropNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityFightPropNotify.PARSER.parseFrom(data);
        }
        
        public static EntityFightPropNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityFightPropNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityFightPropNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityFightPropNotify.PARSER.parseFrom(data);
        }
        
        public static EntityFightPropNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityFightPropNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityFightPropNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropNotify.PARSER, input);
        }
        
        public static EntityFightPropNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropNotify.PARSER, input, extensionRegistry);
        }
        
        public static EntityFightPropNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityFightPropNotify.PARSER, input);
        }
        
        public static EntityFightPropNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityFightPropNotify.PARSER, input, extensionRegistry);
        }
        
        public static EntityFightPropNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropNotify.PARSER, input);
        }
        
        public static EntityFightPropNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityFightPropNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityFightPropNotify prototype) {
            return EntityFightPropNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityFightPropNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityFightPropNotify getDefaultInstance() {
            return EntityFightPropNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityFightPropNotify> parser() {
            return EntityFightPropNotify.PARSER;
        }
        
        @Override
        public Parser<EntityFightPropNotify> getParserForType() {
            return EntityFightPropNotify.PARSER;
        }
        
        @Override
        public EntityFightPropNotify getDefaultInstanceForType() {
            return EntityFightPropNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityFightPropNotify();
            PARSER = new AbstractParser<EntityFightPropNotify>() {
                @Override
                public EntityFightPropNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityFightPropNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class FightPropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Float> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.FLOAT, 0.0f);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityFightPropNotifyOrBuilder
        {
            private int bitField0_;
            private int entityId_;
            private MapField<Integer, Float> fightPropMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 2: {
                        return this.internalGetFightPropMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 2: {
                        return this.internalGetMutableFightPropMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityFightPropNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityFightPropNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.internalGetMutableFightPropMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityFightPropNotifyOuterClass.internal_static_EntityFightPropNotify_descriptor;
            }
            
            @Override
            public EntityFightPropNotify getDefaultInstanceForType() {
                return EntityFightPropNotify.getDefaultInstance();
            }
            
            @Override
            public EntityFightPropNotify build() {
                final EntityFightPropNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityFightPropNotify buildPartial() {
                final EntityFightPropNotify result = new EntityFightPropNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.entityId_ = this.entityId_;
                (result.fightPropMap_ = this.internalGetFightPropMap()).makeImmutable();
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
                if (other instanceof EntityFightPropNotify) {
                    return this.mergeFrom((EntityFightPropNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityFightPropNotify other) {
                if (other == EntityFightPropNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                this.internalGetMutableFightPropMap().mergeFrom(other.internalGetFightPropMap());
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
                EntityFightPropNotify parsedMessage = null;
                try {
                    parsedMessage = EntityFightPropNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityFightPropNotify)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Float> internalGetFightPropMap() {
                if (this.fightPropMap_ == null) {
                    return MapField.emptyMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                }
                return this.fightPropMap_;
            }
            
            private MapField<Integer, Float> internalGetMutableFightPropMap() {
                this.onChanged();
                if (this.fightPropMap_ == null) {
                    this.fightPropMap_ = MapField.newMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.fightPropMap_.isMutable()) {
                    this.fightPropMap_ = this.fightPropMap_.copy();
                }
                return this.fightPropMap_;
            }
            
            @Override
            public int getFightPropMapCount() {
                return this.internalGetFightPropMap().getMap().size();
            }
            
            @Override
            public boolean containsFightPropMap(final int key) {
                return this.internalGetFightPropMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Float> getFightPropMap() {
                return this.getFightPropMapMap();
            }
            
            @Override
            public Map<Integer, Float> getFightPropMapMap() {
                return this.internalGetFightPropMap().getMap();
            }
            
            @Override
            public float getFightPropMapOrDefault(final int key, final float defaultValue) {
                final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public float getFightPropMapOrThrow(final int key) {
                final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearFightPropMap() {
                this.internalGetMutableFightPropMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeFightPropMap(final int key) {
                this.internalGetMutableFightPropMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Float> getMutableFightPropMap() {
                return this.internalGetMutableFightPropMap().getMutableMap();
            }
            
            public Builder putFightPropMap(final int key, final float value) {
                this.internalGetMutableFightPropMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllFightPropMap(final Map<Integer, Float> values) {
                this.internalGetMutableFightPropMap().getMutableMap().putAll(values);
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
    
    public interface EntityFightPropNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        int getFightPropMapCount();
        
        boolean containsFightPropMap(final int p0);
        
        @Deprecated
        Map<Integer, Float> getFightPropMap();
        
        Map<Integer, Float> getFightPropMapMap();
        
        float getFightPropMapOrDefault(final int p0, final float p1);
        
        float getFightPropMapOrThrow(final int p0);
    }
}
