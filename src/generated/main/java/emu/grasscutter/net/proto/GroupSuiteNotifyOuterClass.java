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

public final class GroupSuiteNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_GroupSuiteNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GroupSuiteNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GroupSuiteNotify_GroupMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GroupSuiteNotify_GroupMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GroupSuiteNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GroupSuiteNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016GroupSuiteNotify.proto\"w\n\u0010GroupSuiteNotify\u00122\n\tgroup_map\u0018\u0003 \u0003(\u000b2\u001f.GroupSuiteNotify.GroupMapEntry\u001a/\n\rGroupMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GroupSuiteNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GroupSuiteNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GroupSuiteNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor, new String[] { "GroupMap" });
        internal_static_GroupSuiteNotify_GroupMapEntry_descriptor = GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor.getNestedTypes().get(0);
        internal_static_GroupSuiteNotify_GroupMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_GroupMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class GroupSuiteNotify extends GeneratedMessageV3 implements GroupSuiteNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GROUP_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, Integer> groupMap_;
        private byte memoizedIsInitialized;
        private static final GroupSuiteNotify DEFAULT_INSTANCE;
        private static final Parser<GroupSuiteNotify> PARSER;
        
        private GroupSuiteNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GroupSuiteNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GroupSuiteNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GroupSuiteNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.groupMap_ = MapField.newMapField(GroupMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> groupMap__ = input.readMessage(GroupMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.groupMap_.getMutableMap().put(groupMap__.getKey(), groupMap__.getValue());
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
            return GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetGroupMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupSuiteNotify.class, Builder.class);
        }
        
        private MapField<Integer, Integer> internalGetGroupMap() {
            if (this.groupMap_ == null) {
                return MapField.emptyMapField(GroupMapDefaultEntryHolder.defaultEntry);
            }
            return this.groupMap_;
        }
        
        @Override
        public int getGroupMapCount() {
            return this.internalGetGroupMap().getMap().size();
        }
        
        @Override
        public boolean containsGroupMap(final int key) {
            return this.internalGetGroupMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getGroupMap() {
            return this.getGroupMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getGroupMapMap() {
            return this.internalGetGroupMap().getMap();
        }
        
        @Override
        public int getGroupMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetGroupMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getGroupMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetGroupMap().getMap();
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetGroupMap(), GroupMapDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetGroupMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> groupMap__ = GroupMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, groupMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupSuiteNotify)) {
                return super.equals(obj);
            }
            final GroupSuiteNotify other = (GroupSuiteNotify)obj;
            return this.internalGetGroupMap().equals(other.internalGetGroupMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetGroupMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetGroupMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GroupSuiteNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GroupSuiteNotify.PARSER.parseFrom(data);
        }
        
        public static GroupSuiteNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GroupSuiteNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GroupSuiteNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GroupSuiteNotify.PARSER.parseFrom(data);
        }
        
        public static GroupSuiteNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GroupSuiteNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GroupSuiteNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GroupSuiteNotify.PARSER.parseFrom(data);
        }
        
        public static GroupSuiteNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GroupSuiteNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GroupSuiteNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupSuiteNotify.PARSER, input);
        }
        
        public static GroupSuiteNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupSuiteNotify.PARSER, input, extensionRegistry);
        }
        
        public static GroupSuiteNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GroupSuiteNotify.PARSER, input);
        }
        
        public static GroupSuiteNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GroupSuiteNotify.PARSER, input, extensionRegistry);
        }
        
        public static GroupSuiteNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupSuiteNotify.PARSER, input);
        }
        
        public static GroupSuiteNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupSuiteNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GroupSuiteNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GroupSuiteNotify prototype) {
            return GroupSuiteNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GroupSuiteNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GroupSuiteNotify getDefaultInstance() {
            return GroupSuiteNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<GroupSuiteNotify> parser() {
            return GroupSuiteNotify.PARSER;
        }
        
        @Override
        public Parser<GroupSuiteNotify> getParserForType() {
            return GroupSuiteNotify.PARSER;
        }
        
        @Override
        public GroupSuiteNotify getDefaultInstanceForType() {
            return GroupSuiteNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GroupSuiteNotify();
            PARSER = new AbstractParser<GroupSuiteNotify>() {
                @Override
                public GroupSuiteNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GroupSuiteNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class GroupMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_GroupMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupSuiteNotifyOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, Integer> groupMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetGroupMap();
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
                        return this.internalGetMutableGroupMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupSuiteNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GroupSuiteNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableGroupMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor;
            }
            
            @Override
            public GroupSuiteNotify getDefaultInstanceForType() {
                return GroupSuiteNotify.getDefaultInstance();
            }
            
            @Override
            public GroupSuiteNotify build() {
                final GroupSuiteNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GroupSuiteNotify buildPartial() {
                final GroupSuiteNotify result = new GroupSuiteNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.groupMap_ = this.internalGetGroupMap()).makeImmutable();
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
                if (other instanceof GroupSuiteNotify) {
                    return this.mergeFrom((GroupSuiteNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GroupSuiteNotify other) {
                if (other == GroupSuiteNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableGroupMap().mergeFrom(other.internalGetGroupMap());
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
                GroupSuiteNotify parsedMessage = null;
                try {
                    parsedMessage = GroupSuiteNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GroupSuiteNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, Integer> internalGetGroupMap() {
                if (this.groupMap_ == null) {
                    return MapField.emptyMapField(GroupMapDefaultEntryHolder.defaultEntry);
                }
                return this.groupMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableGroupMap() {
                this.onChanged();
                if (this.groupMap_ == null) {
                    this.groupMap_ = MapField.newMapField(GroupMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.groupMap_.isMutable()) {
                    this.groupMap_ = this.groupMap_.copy();
                }
                return this.groupMap_;
            }
            
            @Override
            public int getGroupMapCount() {
                return this.internalGetGroupMap().getMap().size();
            }
            
            @Override
            public boolean containsGroupMap(final int key) {
                return this.internalGetGroupMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getGroupMap() {
                return this.getGroupMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getGroupMapMap() {
                return this.internalGetGroupMap().getMap();
            }
            
            @Override
            public int getGroupMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetGroupMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getGroupMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetGroupMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearGroupMap() {
                this.internalGetMutableGroupMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeGroupMap(final int key) {
                this.internalGetMutableGroupMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableGroupMap() {
                return this.internalGetMutableGroupMap().getMutableMap();
            }
            
            public Builder putGroupMap(final int key, final int value) {
                this.internalGetMutableGroupMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllGroupMap(final Map<Integer, Integer> values) {
                this.internalGetMutableGroupMap().getMutableMap().putAll(values);
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
    
    public interface GroupSuiteNotifyOrBuilder extends MessageOrBuilder
    {
        int getGroupMapCount();
        
        boolean containsGroupMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getGroupMap();
        
        Map<Integer, Integer> getGroupMapMap();
        
        int getGroupMapOrDefault(final int p0, final int p1);
        
        int getGroupMapOrThrow(final int p0);
    }
}
