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

public final class MusicBeatmapOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicBeatmap_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicBeatmap_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicBeatmapOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicBeatmapOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012MusicBeatmap.proto\u001a\u0016MusicBeatmapList.proto\"N\n\fMusicBeatmap\u0012\u0010\n\bmusic_id\u0018\u0001 \u0001(\r\u0012,\n\u0011beatmap_item_list\u0018\u0002 \u0003(\u000b2\u0011.MusicBeatmapListB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicBeatmapOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicBeatmapListOuterClass.getDescriptor() });
        internal_static_MusicBeatmap_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicBeatmap_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor, new String[] { "MusicId", "BeatmapItemList" });
        MusicBeatmapListOuterClass.getDescriptor();
    }
    
    public static final class MusicBeatmap extends GeneratedMessageV3 implements MusicBeatmapOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MUSIC_ID_FIELD_NUMBER = 1;
        private int musicId_;
        public static final int BEATMAP_ITEM_LIST_FIELD_NUMBER = 2;
        private List<MusicBeatmapListOuterClass.MusicBeatmapList> beatmapItemList_;
        private byte memoizedIsInitialized;
        private static final MusicBeatmap DEFAULT_INSTANCE;
        private static final Parser<MusicBeatmap> PARSER;
        
        private MusicBeatmap(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicBeatmap() {
            this.memoizedIsInitialized = -1;
            this.beatmapItemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicBeatmap();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicBeatmap(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.musicId_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.beatmapItemList_ = new ArrayList<MusicBeatmapListOuterClass.MusicBeatmapList>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.beatmapItemList_.add(input.readMessage(MusicBeatmapListOuterClass.MusicBeatmapList.parser(), extensionRegistry));
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
                    this.beatmapItemList_ = Collections.unmodifiableList((List<? extends MusicBeatmapListOuterClass.MusicBeatmapList>)this.beatmapItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicBeatmapOuterClass.internal_static_MusicBeatmap_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBeatmap.class, Builder.class);
        }
        
        @Override
        public int getMusicId() {
            return this.musicId_;
        }
        
        @Override
        public List<MusicBeatmapListOuterClass.MusicBeatmapList> getBeatmapItemListList() {
            return this.beatmapItemList_;
        }
        
        @Override
        public List<? extends MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder> getBeatmapItemListOrBuilderList() {
            return this.beatmapItemList_;
        }
        
        @Override
        public int getBeatmapItemListCount() {
            return this.beatmapItemList_.size();
        }
        
        @Override
        public MusicBeatmapListOuterClass.MusicBeatmapList getBeatmapItemList(final int index) {
            return this.beatmapItemList_.get(index);
        }
        
        @Override
        public MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder getBeatmapItemListOrBuilder(final int index) {
            return this.beatmapItemList_.get(index);
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
            if (this.musicId_ != 0) {
                output.writeUInt32(1, this.musicId_);
            }
            for (int i = 0; i < this.beatmapItemList_.size(); ++i) {
                output.writeMessage(2, this.beatmapItemList_.get(i));
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
            if (this.musicId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.musicId_);
            }
            for (int i = 0; i < this.beatmapItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.beatmapItemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicBeatmap)) {
                return super.equals(obj);
            }
            final MusicBeatmap other = (MusicBeatmap)obj;
            return this.getMusicId() == other.getMusicId() && this.getBeatmapItemListList().equals(other.getBeatmapItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMusicId();
            if (this.getBeatmapItemListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getBeatmapItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicBeatmap parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicBeatmap.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmap parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmap.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmap parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicBeatmap.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmap parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmap.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmap parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicBeatmap.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmap parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmap.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmap parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmap.PARSER, input);
        }
        
        public static MusicBeatmap parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmap.PARSER, input, extensionRegistry);
        }
        
        public static MusicBeatmap parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBeatmap.PARSER, input);
        }
        
        public static MusicBeatmap parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBeatmap.PARSER, input, extensionRegistry);
        }
        
        public static MusicBeatmap parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmap.PARSER, input);
        }
        
        public static MusicBeatmap parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmap.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicBeatmap.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicBeatmap prototype) {
            return MusicBeatmap.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicBeatmap.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicBeatmap getDefaultInstance() {
            return MusicBeatmap.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicBeatmap> parser() {
            return MusicBeatmap.PARSER;
        }
        
        @Override
        public Parser<MusicBeatmap> getParserForType() {
            return MusicBeatmap.PARSER;
        }
        
        @Override
        public MusicBeatmap getDefaultInstanceForType() {
            return MusicBeatmap.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicBeatmap();
            PARSER = new AbstractParser<MusicBeatmap>() {
                @Override
                public MusicBeatmap parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicBeatmap(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicBeatmapOrBuilder
        {
            private int bitField0_;
            private int musicId_;
            private List<MusicBeatmapListOuterClass.MusicBeatmapList> beatmapItemList_;
            private RepeatedFieldBuilderV3<MusicBeatmapListOuterClass.MusicBeatmapList, MusicBeatmapListOuterClass.MusicBeatmapList.Builder, MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder> beatmapItemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicBeatmapOuterClass.internal_static_MusicBeatmap_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBeatmap.class, Builder.class);
            }
            
            private Builder() {
                this.beatmapItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.beatmapItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicBeatmap.alwaysUseFieldBuilders) {
                    this.getBeatmapItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.musicId_ = 0;
                if (this.beatmapItemListBuilder_ == null) {
                    this.beatmapItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.beatmapItemListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor;
            }
            
            @Override
            public MusicBeatmap getDefaultInstanceForType() {
                return MusicBeatmap.getDefaultInstance();
            }
            
            @Override
            public MusicBeatmap build() {
                final MusicBeatmap result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicBeatmap buildPartial() {
                final MusicBeatmap result = new MusicBeatmap(this);
                final int from_bitField0_ = this.bitField0_;
                result.musicId_ = this.musicId_;
                if (this.beatmapItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.beatmapItemList_ = Collections.unmodifiableList((List<? extends MusicBeatmapListOuterClass.MusicBeatmapList>)this.beatmapItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.beatmapItemList_ = this.beatmapItemList_;
                }
                else {
                    result.beatmapItemList_ = this.beatmapItemListBuilder_.build();
                }
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
                if (other instanceof MusicBeatmap) {
                    return this.mergeFrom((MusicBeatmap)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicBeatmap other) {
                if (other == MusicBeatmap.getDefaultInstance()) {
                    return this;
                }
                if (other.getMusicId() != 0) {
                    this.setMusicId(other.getMusicId());
                }
                if (this.beatmapItemListBuilder_ == null) {
                    if (!other.beatmapItemList_.isEmpty()) {
                        if (this.beatmapItemList_.isEmpty()) {
                            this.beatmapItemList_ = other.beatmapItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureBeatmapItemListIsMutable();
                            this.beatmapItemList_.addAll(other.beatmapItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.beatmapItemList_.isEmpty()) {
                    if (this.beatmapItemListBuilder_.isEmpty()) {
                        this.beatmapItemListBuilder_.dispose();
                        this.beatmapItemListBuilder_ = null;
                        this.beatmapItemList_ = other.beatmapItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.beatmapItemListBuilder_ = (MusicBeatmap.alwaysUseFieldBuilders ? this.getBeatmapItemListFieldBuilder() : null);
                    }
                    else {
                        this.beatmapItemListBuilder_.addAllMessages(other.beatmapItemList_);
                    }
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
                MusicBeatmap parsedMessage = null;
                try {
                    parsedMessage = MusicBeatmap.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicBeatmap)e.getUnfinishedMessage();
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
            public int getMusicId() {
                return this.musicId_;
            }
            
            public Builder setMusicId(final int value) {
                this.musicId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicId() {
                this.musicId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureBeatmapItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.beatmapItemList_ = new ArrayList<MusicBeatmapListOuterClass.MusicBeatmapList>(this.beatmapItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MusicBeatmapListOuterClass.MusicBeatmapList> getBeatmapItemListList() {
                if (this.beatmapItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MusicBeatmapListOuterClass.MusicBeatmapList>)this.beatmapItemList_);
                }
                return this.beatmapItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getBeatmapItemListCount() {
                if (this.beatmapItemListBuilder_ == null) {
                    return this.beatmapItemList_.size();
                }
                return this.beatmapItemListBuilder_.getCount();
            }
            
            @Override
            public MusicBeatmapListOuterClass.MusicBeatmapList getBeatmapItemList(final int index) {
                if (this.beatmapItemListBuilder_ == null) {
                    return this.beatmapItemList_.get(index);
                }
                return this.beatmapItemListBuilder_.getMessage(index);
            }
            
            public Builder setBeatmapItemList(final int index, final MusicBeatmapListOuterClass.MusicBeatmapList value) {
                if (this.beatmapItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setBeatmapItemList(final int index, final MusicBeatmapListOuterClass.MusicBeatmapList.Builder builderForValue) {
                if (this.beatmapItemListBuilder_ == null) {
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addBeatmapItemList(final MusicBeatmapListOuterClass.MusicBeatmapList value) {
                if (this.beatmapItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addBeatmapItemList(final int index, final MusicBeatmapListOuterClass.MusicBeatmapList value) {
                if (this.beatmapItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addBeatmapItemList(final MusicBeatmapListOuterClass.MusicBeatmapList.Builder builderForValue) {
                if (this.beatmapItemListBuilder_ == null) {
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addBeatmapItemList(final int index, final MusicBeatmapListOuterClass.MusicBeatmapList.Builder builderForValue) {
                if (this.beatmapItemListBuilder_ == null) {
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllBeatmapItemList(final Iterable<? extends MusicBeatmapListOuterClass.MusicBeatmapList> values) {
                if (this.beatmapItemListBuilder_ == null) {
                    this.ensureBeatmapItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.beatmapItemList_);
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearBeatmapItemList() {
                if (this.beatmapItemListBuilder_ == null) {
                    this.beatmapItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeBeatmapItemList(final int index) {
                if (this.beatmapItemListBuilder_ == null) {
                    this.ensureBeatmapItemListIsMutable();
                    this.beatmapItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.beatmapItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public MusicBeatmapListOuterClass.MusicBeatmapList.Builder getBeatmapItemListBuilder(final int index) {
                return this.getBeatmapItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder getBeatmapItemListOrBuilder(final int index) {
                if (this.beatmapItemListBuilder_ == null) {
                    return this.beatmapItemList_.get(index);
                }
                return this.beatmapItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder> getBeatmapItemListOrBuilderList() {
                if (this.beatmapItemListBuilder_ != null) {
                    return this.beatmapItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>)this.beatmapItemList_);
            }
            
            public MusicBeatmapListOuterClass.MusicBeatmapList.Builder addBeatmapItemListBuilder() {
                return this.getBeatmapItemListFieldBuilder().addBuilder(MusicBeatmapListOuterClass.MusicBeatmapList.getDefaultInstance());
            }
            
            public MusicBeatmapListOuterClass.MusicBeatmapList.Builder addBeatmapItemListBuilder(final int index) {
                return this.getBeatmapItemListFieldBuilder().addBuilder(index, MusicBeatmapListOuterClass.MusicBeatmapList.getDefaultInstance());
            }
            
            public List<MusicBeatmapListOuterClass.MusicBeatmapList.Builder> getBeatmapItemListBuilderList() {
                return this.getBeatmapItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MusicBeatmapListOuterClass.MusicBeatmapList, MusicBeatmapListOuterClass.MusicBeatmapList.Builder, MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder> getBeatmapItemListFieldBuilder() {
                if (this.beatmapItemListBuilder_ == null) {
                    this.beatmapItemListBuilder_ = new RepeatedFieldBuilderV3<MusicBeatmapListOuterClass.MusicBeatmapList, MusicBeatmapListOuterClass.MusicBeatmapList.Builder, MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>(this.beatmapItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.beatmapItemList_ = null;
                }
                return this.beatmapItemListBuilder_;
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
    
    public interface MusicBeatmapOrBuilder extends MessageOrBuilder
    {
        int getMusicId();
        
        List<MusicBeatmapListOuterClass.MusicBeatmapList> getBeatmapItemListList();
        
        MusicBeatmapListOuterClass.MusicBeatmapList getBeatmapItemList(final int p0);
        
        int getBeatmapItemListCount();
        
        List<? extends MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder> getBeatmapItemListOrBuilderList();
        
        MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder getBeatmapItemListOrBuilder(final int p0);
    }
}
