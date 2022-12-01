// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk2800MHCFAGCKGIB
{
    private static final Descriptors.Descriptor internal_static_Unk2800_MHCFAGCKGIB_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2800_MHCFAGCKGIB_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2800MHCFAGCKGIB() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2800MHCFAGCKGIB.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2800_MHCFAGCKGIB.proto\u001a\u0016DungeonEntryInfo.proto\"\u0086\u0001\n\u0013Unk2800_MHCFAGCKGIB\u0012\u0010\n\bscene_id\u0018\f \u0001(\r\u0012\u0010\n\bpoint_id\u0018\u0006 \u0001(\r\u0012-\n\u0012dungeon_entry_list\u0018\u0001 \u0003(\u000b2\u0011.DungeonEntryInfo\u0012\u001c\n\u0014recommend_dungeon_id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2800MHCFAGCKGIB.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { DungeonEntryInfoOuterClass.getDescriptor() });
        internal_static_Unk2800_MHCFAGCKGIB_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2800_MHCFAGCKGIB_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2800MHCFAGCKGIB.internal_static_Unk2800_MHCFAGCKGIB_descriptor, new String[] { "SceneId", "PointId", "DungeonEntryList", "RecommendDungeonId" });
        DungeonEntryInfoOuterClass.getDescriptor();
    }
    
    public static final class Unk2800_MHCFAGCKGIB extends GeneratedMessageV3 implements Unk2800_MHCFAGCKGIBOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 12;
        private int sceneId_;
        public static final int POINT_ID_FIELD_NUMBER = 6;
        private int pointId_;
        public static final int DUNGEON_ENTRY_LIST_FIELD_NUMBER = 1;
        private List<DungeonEntryInfoOuterClass.DungeonEntryInfo> dungeonEntryList_;
        public static final int RECOMMEND_DUNGEON_ID_FIELD_NUMBER = 8;
        private int recommendDungeonId_;
        private byte memoizedIsInitialized;
        private static final Unk2800_MHCFAGCKGIB DEFAULT_INSTANCE;
        private static final Parser<Unk2800_MHCFAGCKGIB> PARSER;
        
        private Unk2800_MHCFAGCKGIB(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2800_MHCFAGCKGIB() {
            this.memoizedIsInitialized = -1;
            this.dungeonEntryList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2800_MHCFAGCKGIB();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2800_MHCFAGCKGIB(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.dungeonEntryList_ = new ArrayList<DungeonEntryInfoOuterClass.DungeonEntryInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.dungeonEntryList_.add(input.readMessage(DungeonEntryInfoOuterClass.DungeonEntryInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 48: {
                            this.pointId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.recommendDungeonId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.sceneId_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.dungeonEntryList_ = Collections.unmodifiableList((List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfo>)this.dungeonEntryList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk2800MHCFAGCKGIB.internal_static_Unk2800_MHCFAGCKGIB_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2800MHCFAGCKGIB.internal_static_Unk2800_MHCFAGCKGIB_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_MHCFAGCKGIB.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
        }
        
        @Override
        public List<DungeonEntryInfoOuterClass.DungeonEntryInfo> getDungeonEntryListList() {
            return this.dungeonEntryList_;
        }
        
        @Override
        public List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> getDungeonEntryListOrBuilderList() {
            return this.dungeonEntryList_;
        }
        
        @Override
        public int getDungeonEntryListCount() {
            return this.dungeonEntryList_.size();
        }
        
        @Override
        public DungeonEntryInfoOuterClass.DungeonEntryInfo getDungeonEntryList(final int index) {
            return this.dungeonEntryList_.get(index);
        }
        
        @Override
        public DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getDungeonEntryListOrBuilder(final int index) {
            return this.dungeonEntryList_.get(index);
        }
        
        @Override
        public int getRecommendDungeonId() {
            return this.recommendDungeonId_;
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
            for (int i = 0; i < this.dungeonEntryList_.size(); ++i) {
                output.writeMessage(1, this.dungeonEntryList_.get(i));
            }
            if (this.pointId_ != 0) {
                output.writeUInt32(6, this.pointId_);
            }
            if (this.recommendDungeonId_ != 0) {
                output.writeUInt32(8, this.recommendDungeonId_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(12, this.sceneId_);
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
            for (int i = 0; i < this.dungeonEntryList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.dungeonEntryList_.get(i));
            }
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.pointId_);
            }
            if (this.recommendDungeonId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.recommendDungeonId_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2800_MHCFAGCKGIB)) {
                return super.equals(obj);
            }
            final Unk2800_MHCFAGCKGIB other = (Unk2800_MHCFAGCKGIB)obj;
            return this.getSceneId() == other.getSceneId() && this.getPointId() == other.getPointId() && this.getDungeonEntryListList().equals(other.getDungeonEntryListList()) && this.getRecommendDungeonId() == other.getRecommendDungeonId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPointId();
            if (this.getDungeonEntryListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getDungeonEntryListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRecommendDungeonId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2800_MHCFAGCKGIB.PARSER.parseFrom(data);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_MHCFAGCKGIB.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2800_MHCFAGCKGIB.PARSER.parseFrom(data);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_MHCFAGCKGIB.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2800_MHCFAGCKGIB.PARSER.parseFrom(data);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_MHCFAGCKGIB.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_MHCFAGCKGIB.PARSER, input);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_MHCFAGCKGIB.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_MHCFAGCKGIB parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_MHCFAGCKGIB.PARSER, input);
        }
        
        public static Unk2800_MHCFAGCKGIB parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_MHCFAGCKGIB.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_MHCFAGCKGIB.PARSER, input);
        }
        
        public static Unk2800_MHCFAGCKGIB parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_MHCFAGCKGIB.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2800_MHCFAGCKGIB.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2800_MHCFAGCKGIB prototype) {
            return Unk2800_MHCFAGCKGIB.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2800_MHCFAGCKGIB.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2800_MHCFAGCKGIB getDefaultInstance() {
            return Unk2800_MHCFAGCKGIB.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2800_MHCFAGCKGIB> parser() {
            return Unk2800_MHCFAGCKGIB.PARSER;
        }
        
        @Override
        public Parser<Unk2800_MHCFAGCKGIB> getParserForType() {
            return Unk2800_MHCFAGCKGIB.PARSER;
        }
        
        @Override
        public Unk2800_MHCFAGCKGIB getDefaultInstanceForType() {
            return Unk2800_MHCFAGCKGIB.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2800_MHCFAGCKGIB();
            PARSER = new AbstractParser<Unk2800_MHCFAGCKGIB>() {
                @Override
                public Unk2800_MHCFAGCKGIB parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2800_MHCFAGCKGIB(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2800_MHCFAGCKGIBOrBuilder
        {
            private int bitField0_;
            private int sceneId_;
            private int pointId_;
            private List<DungeonEntryInfoOuterClass.DungeonEntryInfo> dungeonEntryList_;
            private RepeatedFieldBuilderV3<DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> dungeonEntryListBuilder_;
            private int recommendDungeonId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2800MHCFAGCKGIB.internal_static_Unk2800_MHCFAGCKGIB_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2800MHCFAGCKGIB.internal_static_Unk2800_MHCFAGCKGIB_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_MHCFAGCKGIB.class, Builder.class);
            }
            
            private Builder() {
                this.dungeonEntryList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.dungeonEntryList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2800_MHCFAGCKGIB.alwaysUseFieldBuilders) {
                    this.getDungeonEntryListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.pointId_ = 0;
                if (this.dungeonEntryListBuilder_ == null) {
                    this.dungeonEntryList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.dungeonEntryListBuilder_.clear();
                }
                this.recommendDungeonId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2800MHCFAGCKGIB.internal_static_Unk2800_MHCFAGCKGIB_descriptor;
            }
            
            @Override
            public Unk2800_MHCFAGCKGIB getDefaultInstanceForType() {
                return Unk2800_MHCFAGCKGIB.getDefaultInstance();
            }
            
            @Override
            public Unk2800_MHCFAGCKGIB build() {
                final Unk2800_MHCFAGCKGIB result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2800_MHCFAGCKGIB buildPartial() {
                final Unk2800_MHCFAGCKGIB result = new Unk2800_MHCFAGCKGIB(this);
                final int from_bitField0_ = this.bitField0_;
                result.sceneId_ = this.sceneId_;
                result.pointId_ = this.pointId_;
                if (this.dungeonEntryListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.dungeonEntryList_ = Collections.unmodifiableList((List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfo>)this.dungeonEntryList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.dungeonEntryList_ = this.dungeonEntryList_;
                }
                else {
                    result.dungeonEntryList_ = this.dungeonEntryListBuilder_.build();
                }
                result.recommendDungeonId_ = this.recommendDungeonId_;
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
                if (other instanceof Unk2800_MHCFAGCKGIB) {
                    return this.mergeFrom((Unk2800_MHCFAGCKGIB)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2800_MHCFAGCKGIB other) {
                if (other == Unk2800_MHCFAGCKGIB.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
                }
                if (this.dungeonEntryListBuilder_ == null) {
                    if (!other.dungeonEntryList_.isEmpty()) {
                        if (this.dungeonEntryList_.isEmpty()) {
                            this.dungeonEntryList_ = other.dungeonEntryList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureDungeonEntryListIsMutable();
                            this.dungeonEntryList_.addAll(other.dungeonEntryList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.dungeonEntryList_.isEmpty()) {
                    if (this.dungeonEntryListBuilder_.isEmpty()) {
                        this.dungeonEntryListBuilder_.dispose();
                        this.dungeonEntryListBuilder_ = null;
                        this.dungeonEntryList_ = other.dungeonEntryList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.dungeonEntryListBuilder_ = (Unk2800_MHCFAGCKGIB.alwaysUseFieldBuilders ? this.getDungeonEntryListFieldBuilder() : null);
                    }
                    else {
                        this.dungeonEntryListBuilder_.addAllMessages(other.dungeonEntryList_);
                    }
                }
                if (other.getRecommendDungeonId() != 0) {
                    this.setRecommendDungeonId(other.getRecommendDungeonId());
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
                Unk2800_MHCFAGCKGIB parsedMessage = null;
                try {
                    parsedMessage = Unk2800_MHCFAGCKGIB.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2800_MHCFAGCKGIB)e.getUnfinishedMessage();
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
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPointId() {
                return this.pointId_;
            }
            
            public Builder setPointId(final int value) {
                this.pointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointId() {
                this.pointId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureDungeonEntryListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.dungeonEntryList_ = new ArrayList<DungeonEntryInfoOuterClass.DungeonEntryInfo>(this.dungeonEntryList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<DungeonEntryInfoOuterClass.DungeonEntryInfo> getDungeonEntryListList() {
                if (this.dungeonEntryListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfo>)this.dungeonEntryList_);
                }
                return this.dungeonEntryListBuilder_.getMessageList();
            }
            
            @Override
            public int getDungeonEntryListCount() {
                if (this.dungeonEntryListBuilder_ == null) {
                    return this.dungeonEntryList_.size();
                }
                return this.dungeonEntryListBuilder_.getCount();
            }
            
            @Override
            public DungeonEntryInfoOuterClass.DungeonEntryInfo getDungeonEntryList(final int index) {
                if (this.dungeonEntryListBuilder_ == null) {
                    return this.dungeonEntryList_.get(index);
                }
                return this.dungeonEntryListBuilder_.getMessage(index);
            }
            
            public Builder setDungeonEntryList(final int index, final DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
                if (this.dungeonEntryListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDungeonEntryList(final int index, final DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDungeonEntryList(final DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
                if (this.dungeonEntryListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.add(value);
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDungeonEntryList(final int index, final DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
                if (this.dungeonEntryListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDungeonEntryList(final DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDungeonEntryList(final int index, final DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDungeonEntryList(final Iterable<? extends DungeonEntryInfoOuterClass.DungeonEntryInfo> values) {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.ensureDungeonEntryListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.dungeonEntryList_);
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDungeonEntryList() {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.dungeonEntryList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDungeonEntryList(final int index) {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.ensureDungeonEntryListIsMutable();
                    this.dungeonEntryList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.dungeonEntryListBuilder_.remove(index);
                }
                return this;
            }
            
            public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder getDungeonEntryListBuilder(final int index) {
                return this.getDungeonEntryListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getDungeonEntryListOrBuilder(final int index) {
                if (this.dungeonEntryListBuilder_ == null) {
                    return this.dungeonEntryList_.get(index);
                }
                return this.dungeonEntryListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> getDungeonEntryListOrBuilderList() {
                if (this.dungeonEntryListBuilder_ != null) {
                    return this.dungeonEntryListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder>)this.dungeonEntryList_);
            }
            
            public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder addDungeonEntryListBuilder() {
                return this.getDungeonEntryListFieldBuilder().addBuilder(DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance());
            }
            
            public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder addDungeonEntryListBuilder(final int index) {
                return this.getDungeonEntryListFieldBuilder().addBuilder(index, DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance());
            }
            
            public List<DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder> getDungeonEntryListBuilderList() {
                return this.getDungeonEntryListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> getDungeonEntryListFieldBuilder() {
                if (this.dungeonEntryListBuilder_ == null) {
                    this.dungeonEntryListBuilder_ = new RepeatedFieldBuilderV3<DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder>(this.dungeonEntryList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.dungeonEntryList_ = null;
                }
                return this.dungeonEntryListBuilder_;
            }
            
            @Override
            public int getRecommendDungeonId() {
                return this.recommendDungeonId_;
            }
            
            public Builder setRecommendDungeonId(final int value) {
                this.recommendDungeonId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRecommendDungeonId() {
                this.recommendDungeonId_ = 0;
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
    
    public interface Unk2800_MHCFAGCKGIBOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        int getPointId();
        
        List<DungeonEntryInfoOuterClass.DungeonEntryInfo> getDungeonEntryListList();
        
        DungeonEntryInfoOuterClass.DungeonEntryInfo getDungeonEntryList(final int p0);
        
        int getDungeonEntryListCount();
        
        List<? extends DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> getDungeonEntryListOrBuilderList();
        
        DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getDungeonEntryListOrBuilder(final int p0);
        
        int getRecommendDungeonId();
    }
}
